/*
* LITTLE CLEANER 1.0
* APLICACI�N DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEM�TICA EDUCATIVA
* AUTORES: CASTA�ON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, L�PEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUT�NOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.tiles.floorTiles;

import logic.graphicsTools.Assets;
import logic.tiles.Tile;

public class waterBlock extends Tile{

	public waterBlock(int id) {
		super(Assets.waterBlock, id);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isSolid() {
		
		return true;
	}

}
