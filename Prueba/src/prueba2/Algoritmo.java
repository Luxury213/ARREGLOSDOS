package prueba2;

import java.util.Scanner;

public class Algoritmo {
  public static void main(String[] args) {
	 int[][] A = new int[2][2];
	 int[][] B = new int[2][2];
	 int choice;
	 Scanner  reader = new Scanner(System.in);
	 do{
	 menu();
	 choice = reader.nextInt();
	 switch(choice){
	 case 1:
	 enterMatrix(A);
	 break;
	 case 2:
	 enterMatrix(B);
	 break;
	 case 3:
	 add(A,B);
	 break;
	 case 4:
	 subtract(A,B);
	 break;
	 case 5:
	 multiply(A,B);
	 break;
	 case 6:
	 break;
	 }
	 }while(choice != 6);
	 }
	 public static void menu(){
	 System.out.println("1. Insertar matrix A");
	 System.out.println("2. Insertar matrix B");
	 System.out.println("3.  A + B");
	 System.out.println("4.  A - B");
	 System.out.println("5.  A * B");
	 System.out.println("6. Salir");
	 }
	 public static void enterMatrix(int[][] a){
	 Scanner reader = new Scanner(System.in);
	 System.out.print("Iserte el numerode la primera fila y primera columna ");
	 a[0][0] = reader.nextInt();
	 System.out.print("Inserte el numero de la primera fila y segunda columna ");
	 a[0][1] = reader.nextInt();
	 System.out.print("Inserte el numero de la segunda fila y primera columna ");
	 a[1][0] = reader.nextInt();
	 System.out.print("Inserte el numero de la segunda fila y segunda columna ");
	 a[1][1] = reader.nextInt();
	 }
	 public static void add(int[][] a,int[][] b){
	 System.out.println("A + B is");
	 System.out.println((a[0][0]+b[0][0]) + "\t" +
	 (a[0][1]+b[0][1]));

	 System.out.println((a[1][0]+b[1][0]) + "\t" +
	 (a[1][1]+b[1][1]));
	 }
	 public static void subtract(int[][] a,int[][] b){
	 System.out.println("A - B is");
	 System.out.println((a[0][0]-b[0][0]) + "\t" + (a[0][1]-
	 b[0][1]));
	 System.out.println((a[1][0]-b[1][0]) + "\t" + (a[1][1]-
	 b[1][1]));
	 }
	 public static void multiply(int[][] a,int[][] b){
	 System.out.println("A * B is");
	 System.out.println((a[0][0]*b[0][0] + a[0][1]*b[1][0]) +
	 "\t" + (a[0][0]*b[0][1] + a[0][1]*b[1][1]));
	 System.out.println((a[1][0]*b[0][0] + a[1][1]*b[1][0]) +
	 "\t" + (a[1][0]*b[0][1] + a[1][1]*b[1][1]));
	 }
	 
}

