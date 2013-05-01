package com.AlyssonAjackson;

/*
 * 4- Faça um programa em Java que leia um conjunto de 50 inteiros e o imprima na ordem
   contrária da que foi lida.
 */

import javax.swing.JOptionPane;

public class lista3_4 {
	
	public static void main(String args[]){
		
		int num[] = new int[50];
		
		for(int i = 0; i < num.length; i++){
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		}
		
		for(int j = num.length -1; j >= 0; j--){
			System.out.println(num[j]);
		}
		
	}
	
}
