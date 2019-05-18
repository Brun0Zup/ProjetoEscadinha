package com.br.escadinha;

import java.util.Scanner;

public class AppEscadinha {

	public static void main(String[] args) {
		   Scanner entrada = new Scanner (System.in);
			
		 int continuar = 0;
		 while (continuar == 0) {
		   System.out.println("Qual o Tamanho da escada?");
			int tamanhoDaEscada = entrada.nextInt();
			
			System.out.println("Qual o caracter?");
			StringBuilder escadinha = new StringBuilder();
			String degrau = entrada.next();
			
			for(int controle = 0; controle < tamanhoDaEscada; controle++) {
		escadinha.insert(controle, degrau);
		System.out.println(escadinha);
		}
			System.out.println("0 para cotinuar. 1 para sair");
			continuar = entrada.nextInt();
			}
		}

}
