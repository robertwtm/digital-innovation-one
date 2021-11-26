// DESAFIO: Leia um valor inteiro N. Este valor ser� a quantidade de valores que ser�o lidos em seguida. Para cada valor lido, mostre uma mensagem em ingl�s dizendo se este valor lido � par (EVEN), �mpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descri��o correta seja (EVEN NULL), pois por defini��o zero � par, seu programa dever� imprimir apenas NULL.
// Sa�da: Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras dever�o ser mai�sculas e sempre dever� haver um espa�o entre duas palavras impressas na mesma linha.

import java.io.IOException;
import java.util.*;

public class ParIMpar {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();

		try {
			for (int i = 0; i < N; i++) {
				int x = leitor.nextInt();
				if (x == 0)
					System.out.println("NULL");
				else if (x % 2 == 0 && x > 0)
					System.out.println("EVEN POSITIVE");
				else if (x % 2 == 0 && x < 0)
					System.out.println("EVEN NEGATIVE");
				else if (x % 2 != 0 && x > 0)
					System.out.println("ODD POSITIVE");
				else if (x % 2 != 0 && x < 0)
					System.out.println("ODD NEGATIVE");
			}

		} catch (Exception e) {
			System.out.println("Valor invalido" +e);
		}
	}
}
