package exercicioTres;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("qual o tamanho do array?");
		
		Integer n = sc.nextInt();
		
		System.out.println("qual o valor alvo que deseja calcular a diferença?");
		Integer k = sc.nextInt();
		
		int [] array= new int [n];
		
		for(int i = 0 ; i<array.length ; i++) {
			System.out.println("qual o valor deseja adicionar no array");
		    array[i] = sc.nextInt();
		}

		
		
		System.out.println("total de pares que contem a diferença igual o valor desejado : " + diferencaEntrePares(array, k));
		
		
		sc.close();
	}
	public static int diferencaEntrePares(int[] array , int valorAlvo) {
	
		int totalPares= 0 ;
		
		
		
		for ( int i = array.length-1 ; i>0 ; i--) {
			int diferenca = array[i] - array[i-1];
			if (diferenca == valorAlvo) {
				totalPares++;
			}
			
		}
		return totalPares;
		
	}

}
