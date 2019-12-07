/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.tiles.floorTiles;

import java.awt.image.BufferedImage;

import logic.graphicsTools.Assets;
import logic.tiles.Tile;

public class stoneBorder extends Tile{

	public stoneBorder(int id) {
		super(Assets.stoneBorder, id);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean isSolid() {
		
		return true;
	}
}
