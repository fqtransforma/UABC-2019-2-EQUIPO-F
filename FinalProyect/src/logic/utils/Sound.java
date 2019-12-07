/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.utils;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Sound implements Runnable {

	private String fileLocation;
	private File soundFile;
	private AudioInputStream audioInputStream;
	private AudioFormat audioFormat;
	private SourceDataLine line;
	private boolean running = false;
	Thread t;

	public Sound(String file, boolean loop) {

		fileLocation = file;
		running = loop;

	}

	public void play() {
		t = new Thread(this);
		t.start();
	}

	public void run() {
		playSound(fileLocation);
	}

	private void playSound(String fileName) {

		do {

			soundFile = new File(fileName);
			audioInputStream = null;
			try {
				audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
			audioFormat = audioInputStream.getFormat();
			line = null;
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
			try {
				line = (SourceDataLine) AudioSystem.getLine(info);
				line.open(audioFormat);
			} catch (LineUnavailableException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			line.start();
			int nBytesRead = 0;
			byte[] abData = new byte[128000];
			while (nBytesRead != -1) {
				try {
					nBytesRead = audioInputStream.read(abData, 0, abData.length);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (nBytesRead >= 0) {
					int nBytesWritten = line.write(abData, 0, nBytesRead);
				}
			}
			line.drain();
			line.close();

		} while (running);

	}

	public void stop() {

		line.flush();
		line.drain();
		line.close();
		running = false;
	}
}