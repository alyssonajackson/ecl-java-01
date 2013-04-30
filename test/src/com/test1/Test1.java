package com.test1;

import java.util.Scanner;

public class Test1{
	public static void main(String[] Args){
	
	
	
		Scanner s = new Scanner(System.in);
	        //nessa linha, está sendo declarado um objeto "s", do tipo Scanner. Assim como um objeto do tipo string possui o método ".equals()", o objeto do tipo Scanner possui o nextLine()
	
		System.out.println("Qual o seu nome?");
	
		String nome = s.nextLine();
	        //o método nextLine(), serve para detectar quando o usuário finaliza a linha (dá um enter) e então retornar esse valor para a variável
	
		System.out.println("Bem vindo" + nome);
	
	}
}