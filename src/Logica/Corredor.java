package Logica;

import java.util.Random;

public class Corredor extends Thread {

	public int espera;
	public int x, y;
	public int posicion;
	public Equipo equipo;

	public Corredor(int x, int y, int pos, Equipo equipo) {
		super();
		this.x = x;
		this.y = y;
		this.posicion = pos;
		this.equipo = equipo;
		Random r = new Random();

		espera = r.nextInt(3000);

	}

	public void run() {
		System.out.println("El corredor " + posicion + " del equipo "+equipo.id+" ha empezado su carrera");

		int i = 0;
		while (i < 100) {

			try {
				x = x + 10;
				Thread.sleep(espera);
				System.out.println("Poscion "+x);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("El corredor " + posicion + " ha terminado su carrera");
	}

}
