package com.AlyssonAjackson;

import javax.swing.JOptionPane;

/*
 * 3- Faça um programa em Java para ler um conjunto de 150 notas dos alunos de uma
   disciplina; armazená-lo em um vetor NOTAS e imprimir a maior e a menor nota e as
   posições que elas ocupam no vetor (supor que não há empates).
 */

public class lista3_3 {
	
	public static void main(String args[]){
		int notas[] = new int[4];
		int maior_nota = -1, maior_nota_index = -1;
		int menor_nota = -1, menor_nota_index = -1;
		
		for(int i = 0; i < notas.length; i++){
			
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota " + i + ": "));

			//avoid errors introduced by the vars initialization
			if(i == 0){
				menor_nota = notas[i];
				menor_nota_index = i;
				
				maior_nota = notas[i];
				maior_nota_index = i;
			}
			
			if(notas[i] > maior_nota){
				maior_nota_index = i;
				maior_nota = notas[i];
			}
			else if(notas[i] < menor_nota){
				menor_nota_index = i;
				menor_nota = notas[i];
			}			
		}
		
		System.out.println("A maior nota digitada foi: " + maior_nota + " está na posição " + maior_nota_index + " do vetor.");
		System.out.println("A menor nota digitada foi: " + menor_nota + " está na posição " + menor_nota_index + " do vetor.");		
	}
	
}
