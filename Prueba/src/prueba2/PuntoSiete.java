package prueba2;

import java.util.Scanner;
public class PuntoSiete {
	public static void main(String[] args) { Scanner in = new Scanner(System.in); double[] scores = new
			double[5]; double total = 0; double avg = 0;

			 for(int i = 0; i < 5; i++){
			 System.out.println("Ingrese la nota");
			 scores[i] = in.nextDouble(); total+=scores[i];
			 }
			 avg = total / 5;
			 System.out.println("el promedio es " + avg);
			 }
			}

