package mainPackage;
/*
 * @author:		Josep Oriol Lopez Bosch / 	David Dalmau Dieguez / Octavio Bernal Vilana
 * @fecha:		19/04/2022
 * @version:	0.0.1
 */
import raicesPackage.Raices;

public class MainApp {

	public static void main(String[] args) {
		
		// 1 soluci�n real.
		Raices r1 = new Raices(1,-2,1);
		// 2 soluciones reales
		Raices r2 = new Raices(5,5,1);
		// Ninguna soluci�n real.
		Raices r3 = new Raices(5,2,1);

		System.out.println("- Ecuaci�n 1");
		r1.calcular();
		System.out.println("- Ecuaci�n 2");
		r2.calcular();
		System.out.println("- Ecuaci�n 3");
		r3.calcular();

	}

}
