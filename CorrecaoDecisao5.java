package SwitchCase;

import java.util.Scanner;

public class CorrecaoDecisao5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int quant,codigo;
		float valorTotal;
		
		System.out.println("\nLanchonete--Fique na PAZ- By Charles");
		System.out.println("\nMenu de produtos");
		System.out.println("\n1 - Cachorro Quente - R$ 10,00");
		System.out.println("\n2 - X-Salada - R$ 15,00");
		System.out.println("\n3 - X-Bacon - R$ 18,00");
		System.out.println("\n4 - Bauru - R$ 12,00");
		System.out.println("\n5 - Refrigerante - R$ 8,00");
		System.out.println("\n6 - Suco de Laranja - R$ 13,00");
		System.out.println("\nEscolha o seu produto:");
		codigo = ler.nextInt();
		System.out.println("\nDigite a quantidade deste produto: ");
		quant = ler.nextInt();
		
		switch(codigo) {
		case 1:
			valorTotal = quant * 10;
			System.out.println("\nCachorro Quente - Valor Total: R$ "+valorTotal);
			break;
		case 2:
			valorTotal = quant * 15;
			System.out.println("\nX-Salada - Valor Total: R$ "+valorTotal);
			break;
		case 3:
			valorTotal = quant * 18.30f;
			System.out.println("\nX-Bacon - Valor Total: R$ "+valorTotal);
			break;
		case 4:
			valorTotal = quant * 12;
			System.out.println("\nBauru - Valor Total: R$ "+valorTotal);
			break;
		case 5:
			valorTotal = quant * 8;
			System.out.println("\nRefrigerante - Valor Total: R$ "+valorTotal);
			break;
		case 6:
			valorTotal = quant * 13;
			System.out.println("\nSuco de Laranja - Valor Total: R$ "+valorTotal);
			break;
		default:
			System.out.println("\nCódigo Inválido!!!");
		}
		

	}

}