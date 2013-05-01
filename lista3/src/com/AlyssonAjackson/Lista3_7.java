package com.AlyssonAjackson;

import javax.swing.JOptionPane;

/*
 * 7- Faça um programa em Java para ler 30 valores inteiros, armazená-los em um vetor, e em
   seguida:
   a) Imprimir os dois maiores valores contidos no vetor;
   b) Imprimir todos os elementos maiores que a média aritmética dos valores do vetor, e
      suas respectivas posições no vetor.
 */

public class Lista3_7 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		int[] maior = {0, 0}; //maior 0: primeiro maior | maior[1]: segundo maior
		int aux = 0, soma = 0, media = 0;
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição " + i + ", no vetor: "));
			
			soma += arr[i];
			
			if(arr[i] > maior[0]){
				aux = maior[0];
				maior[0] = arr[i];
				maior[1] = aux;
			}else if(arr[i] > maior[1]){
				maior[1] = arr[i];
			}
		}
		
		media = soma / arr.length;
		
		System.out.println("Os maiores números digitados foram: " + maior[0] + " e " + maior[1]);		
		
		System.out.println("Os valores acima da média são: ");
		for(int j = 0; j < arr.length; j++){
			if(arr[j] > media)
				System.out.println("Valor: " + arr[j] + ", está na posição " + j + " do vetor.");
		}	
		
	}

}

