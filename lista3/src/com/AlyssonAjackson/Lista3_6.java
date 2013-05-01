package com.AlyssonAjackson;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/*
 * 6- Faça um programa em Java para ler uma variável de 100 elementos inteiros e verificar se
   existem elementos iguais a 30. Se existirem, escrever as posições em que estão
   armazenados; caso contrário, imprimir a mensagem “Não há ocorrência do elemento 30 no
   vetor”.
 */

public class Lista3_6 {

	public static void main(String args[]){
		int arr[] = new int[100];
		ArrayList<Integer> posicoes = new ArrayList<Integer>();

		for(int i = 0; i < arr.length; i++){
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição " + i + ", no vetor: "));
			if(arr[i] == 30){
				posicoes.add(i);
			}
		}
		
		if(posicoes.size() > 0){
			System.out.println("O número 30 aparece nas posições: ");
			for(int x : posicoes){
				System.out.println(x);
			}
		}
	}
	
}
