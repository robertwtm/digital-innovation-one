// O jogo de xadrez possui várias peças com movimentos curiosos: uma delas é a dama, que pode se mover qualquer quantidade de casas na mesma linha, na mesma coluna, ou em uma das duas diagonais, conforme exemplifica a figura abaixo:
// O grande mestre de xadrez Kary Gasparov inventou um novo tipo de problema de xadrez: dada a posição de uma dama em um tabuleiro de xadrez vazio (ou seja, um tabuleiro 8 × 8, com 64 casas), de quantos movimentos, no mínimo, ela precisa para chegar em outra casa do tabuleiro? Kary achou a solução para alguns desses problemas, mas teve dificuldade com outros, e por isso pediu que você escrevesse um programa que resolve esse tipo de problema.  
package Dama;
import java.util.Scanner;

public class Dama {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x1, y1, x2, y2;
		// se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1
		// movimento
		// se estiver em qualquer outra posição, a rainha gastará 2 movimentos!
		while (true) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)
				break; // condição de parada
			if (x1 == x2 && y1 == y2) // mesma posição
				System.out.println("0");
			else if (x1 == x2 || y1 == y2) // mesma linha ou mesma coluna
				System.out.println("1");
			else if ((x2 - x1) == -(y2 - y1) || -(x2 - x1) == -(y2 - y1) || -(x2 - x1) == (y2 - y1)
					|| (x2 - x1) == (y2 - y1))
				System.out.println("1"); // mesma diagonal
			else
				System.out.println("2"); // o resto...
		}
		sc.close();
	}
}
