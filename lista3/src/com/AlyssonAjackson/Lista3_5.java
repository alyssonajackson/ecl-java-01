package com.AlyssonAjackson;

/*
 * 5- Faça um programa em Java que leia dois vetores de 25 elementos inteiros cada; intercale
   os elementos destes dois conjuntos formando um novo vetor de 50 posições e imprima o
   resultado.
 */

import javax.swing.JOptionPane;

public class Lista3_5 {
	
	public static void main(String args[]){
	
		int arr1[] = new int[25];
		int arr2[] = new int[25];
		int union[] = new int[50];
		
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o vetor 1, na posição " + i + ": "));
			arr2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o vetor 2, na posição " + i + ": "));
			
			union[i] = arr1[i];
			union[25 + i] = arr2[i];
		}
		
		for(int j = 0; j < union.length; j++)
			System.out.println(j + ": " + union[j]);
		
	}

}
