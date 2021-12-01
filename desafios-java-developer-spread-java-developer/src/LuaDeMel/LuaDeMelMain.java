// Desafio Romeu e Julieta acabaram de casar e est�o planejamendo a Lua de Mel na Europa. Como v�o visitar v�rios pa�ses, o fuso hor�rio de cada um � diferente, por isso eles precisam ficar atento �s escalas.
//Para que a Lua de Mel deles seja um sucesso, ele pediram que voc� desenvolva um aplicativo que, a partir da hora de sa�da, tempo de viagem e fuso hor�rio do destino comparado ao pa�s de origem, informe a hora de chegada de cada v�o no destino. 
//Por exemplo, se eles partirem �s 10 horas da manh� para uma viagem de 4 horas rumo a um destino que fica � leste, em um fuso hor�rio com uma hora a mais com rela��o ao fuso hor�rio do ponto de partida, a hora de chegada ter� que ser: 10 horas + 4 horas de viagem + 1 hora de deslocamento pelo fuso, ou seja, chegar�o �s 15 horas. Note que se a hora calculada for igual a 24, seu programa dever� imprimir 0 (zero).

// Sa�da Imprima um inteiro que indica a hora local prevista no destino, conforme os exemplos abaixo.

package LuaDeMel;

import java.util.Scanner;

public class LuaDeMelMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
		int tempoviagem = sc.nextInt();
		int fuso = sc.nextInt();

		int ajuste = 0;

		ajuste = horasaida + tempoviagem + fuso;

		if (ajuste == 24) {
			System.out.println(ajuste);
		}

		System.out.println(ajuste);

		sc.close();
	}
}
