package com.AlyssonAjackson;

import javax.swing.JOptionPane;

/*
 * 2- Faça um programa em Java para ler um conjunto de 150 notas dos alunos de uma
   disciplina; armazená-lo em um vetor NOTAS e imprimir a maior nota e as posições que
   elas ocupam no vetor (supor que há empates).
 */

public class lista3_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int notas[] = new int[150];
		int maior_nota = 0;
		String maior_nota_indexes = " ";
		
		for(int i = 0; i < notas.length; i++){
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota " + i + ": "));
			if(notas[i] > maior_nota){
				maior_nota = notas[i];
			}
		}
		
		for(int j = 0; j < notas.length; j++){
			if(notas[j] == maior_nota){
				maior_nota_indexes += j + " ";
			}
		}
		
		System.out.println("A maior nota digitada foi: " + maior_nota + " está nas posições: (" + maior_nota_indexes + ") do vetor.");		
	}

}
