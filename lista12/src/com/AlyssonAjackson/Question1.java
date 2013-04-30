package com.AlyssonAjackson;

import javax.swing.*;


public class Question1 {
	
	public static void main(String args[]){
		
		String cont = "y";
		String nome, sexo, estado_saude;
		Integer idade, i, total_pessoas, aptos = 0, inaptos = 0;
		
		total_pessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas serão analisadas?"));
		
		while(cont.equals("y")){
			
			for(i = 0; i < total_pessoas; i++){
				nome = JOptionPane.showInputDialog("Digite o nome?:");
				sexo = JOptionPane.showInputDialog("Digite o sexo:");
				estado_saude = JOptionPane.showInputDialog("Estado de saúde está OK? (s/n):");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
				
				if(sexo.matches("(?i)m|masculino|homem|h") && idade >= 18 && estado_saude.equals("s")){
					JOptionPane.showMessageDialog(null, nome + " está apto ao serviço militar.");
					aptos++;
				}else{
					inaptos++;
				}
			}
			
			JOptionPane.showMessageDialog(null, "Total de " + aptos + " pessoas aptas, em um total de " + (aptos + inaptos));
			
			cont = JOptionPane.showInputDialog("Continuar? (y/n)");
			
		}
	}

}
