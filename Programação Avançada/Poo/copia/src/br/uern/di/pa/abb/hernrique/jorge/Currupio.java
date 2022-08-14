package br.uern.di.pa.abb.hernrique.jorge;

import br.uern.di.pa.abb.hernrique.jorge.Passaro;

public class Currupio extends Passaro{
private int distanciaMaxima = 0;
	
	public Currupio(int n) {
		this.distanciaMaxima = n;
	}
	@Override
	public void cantar() {
		System.out.println("Piu frio fru fri Pió");
	}

	@Override
	public int voar(int x) {
		int distancia = 0;
		if (x > this.distanciaMaxima)
		{
			distancia = this.distanciaMaxima;
		}
		else
		{
			distancia = x;
		}
		return distancia;
	}

}
