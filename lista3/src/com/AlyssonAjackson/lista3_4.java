package com.AlyssonAjackson;

import javax.swing.JOptionPane;

public class lista3_4 {
	
	public static void main(String args[]){
		
		int num[] = new int[3];
		
		for(int i = 0; i < num.length; i++){
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro")); 	
		}
		
	}
	
}
