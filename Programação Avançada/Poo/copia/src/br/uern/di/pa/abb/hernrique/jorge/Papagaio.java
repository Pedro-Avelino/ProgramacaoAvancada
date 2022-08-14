package br.uern.di.pa.abb.hernrique.jorge;

import br.uern.di.pa.abb.hernrique.jorge.Passaro;

public class Papagaio extends Passaro{
	private int distanciaMaxima = 0;
	
	public Papagaio(int n) {
		this.distanciaMaxima = n;
	}
	
	@Override
	public void cantar() {
		System.out.println("Papagaio legal");		
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
