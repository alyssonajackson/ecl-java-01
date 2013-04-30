package com.AlyssonAjackson;

import javax.swing.JOptionPane;

/*
 * 1- Faça um programa em Java para ler um conjunto de 150 notas dos alunos de uma
disciplina; armazená-lo em um vetor NOTAS e imprimir a maior nota e a posição que ela
ocupa no vetor (supor que não há empates).
 *
 */

public class Lista3_1 {
	public static void main(String args[]){
		int notas[] = new int[150];
		int maior_nota = 0, maior_nota_index;
		
		for(int i = 0; i < notas.length; i++){
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota " + i + ": "));
			if(notas[i] > maior_nota){
				maior_nota_index = i;
				maior_nota = notas[i];
			}
		}
		
		System.out.println("A maior nota digitada foi: " + maior_nota + " está na posição " + maior_nota_index + " do vetor.");
	}
}
