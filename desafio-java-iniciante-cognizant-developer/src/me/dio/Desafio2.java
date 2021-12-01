/*Leia um n�mero inteiro que representa um c�digo de DDD para discagem interurbana. Em seguida, informe � qual cidade o DDD pertence, considerando a tabela abaixo:
Se a entrada for qualquer outro DDD que n�o esteja presente na tabela acima, o programa dever� informar: DDD nao cadastrado
Entrada
A entrada consiste de um �nico valor inteiro.
Sa�da
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso n�o existir DDD correspondente ao n�mero digitado.*/

package me.dio;

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 61) {
			System.out.printf("Brasilia\n");
		} else if (a == 71) {
			System.out.printf("Salvador\n");
		} else if (a == 11) {
			System.out.printf("Sao Paulo\n");
		} else if (a == 21) {
			System.out.printf("Rio de Janeiro\n");
		} else if (a == 32) {
			System.out.printf("Juiz de Fora\n");
		} else if (a == 19) {
			System.out.printf("Campinas\n");
		} else if (a == 27) {
			System.out.printf("Vitoria\n");
		} else if (a == 31) {
			System.out.printf("Belo Horizonte\n");
		} else {
			System.out.printf("DDD nao cadastrado\n");
		}
	}
}
