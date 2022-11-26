package Logica;

import javax.swing.JFrame;

public class Equipo {

	public Corredor corredores[];
	public int y;
	public int id;
	public int corredor;
	
	final int posx[]= {33,300,600,900};
	
	public Equipo(int y, int id) {
		super();
		this.y = y;
		this.id = id;
		corredor = -1;
		anadirCorredores(this);
		relevo();
	}

	public void anadirCorredores(Equipo eq) {
		corredores = new Corredor[3];
		for (int i = 0; i < 3; i++) {
			Corredor c = new Corredor(posx[i], y, i + 1, this);
			corredores[i] = c;
		}
	}

	public void relevo() {

		corredor = corredor + 1;
		corredores[corredor].start();
	}

}
