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
		int maior_nota = 0, maior_nota_index;
		int menor_nota = 0, menor_nota_index;
		
		for(int i = 0; i < notas.length; i++){
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota " + i + ": "));
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
