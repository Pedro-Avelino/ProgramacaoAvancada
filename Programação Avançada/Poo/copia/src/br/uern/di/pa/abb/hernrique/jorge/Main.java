package br.uern.di.pa.abb.hernrique.jorge;

import br.uern.di.pa.abb.hernrique.jorge.Papagaio;
import br.uern.di.pa.abb.hernrique.jorge.Currupio;

public class Main {

	public static void main(String[] args) {
		Currupio p1 = new Currupio(100);
		Papagaio p2 = new Papagaio(100);

		p1.cantar();
		System.out.println("Currupio voa: " + p1.voar(23));
		
		System.out.println(" ");
		
		p2.cantar();
		System.out.println("Papagaio voa: " + p2.voar(56));
	}

}
