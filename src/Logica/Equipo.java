package Logica;

public class Equipo {

	public Corredor corredores[];
	public int y;
	public int id;
	public int corredor;

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
			Corredor c = new Corredor(0, 0, i + 1, this);
			corredores[i] = c;
		}
	}

	public void relevo() {

		corredor = corredor + 1;
		corredores[corredor].start();
	}

}
