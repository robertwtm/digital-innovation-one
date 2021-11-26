// O MacPRONALTS est� com uma super promo��o, exclusivo para os competidores da primeira Seletiva do MaratonaTEC. S� que teve um problema, todos os maratonistas foram tentar comprar ao mesmo tempo, com isso gerou uma fila muito grande. O pior � que a mo�a do caixa estava sem calculadora ou um programa para ajud�-la a calcular com maior agilidade, eis que surge voc� para fazer um programa para ajudar a coitada e aumentar a renda do MacPRONALTS. Segue o card�pio do dia contendo o n�mero do produto e seu respectivo valor.
// Sa�da Voc� deve imprimir o valor da compra com duas casas decimais.

package MaratonaTec;

import java.util.*;

public class MaratonaTec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int produtos = 0, quantidade = 0;
		double res = 0, valor = 0;
		int N = Integer.parseInt(sc.nextLine());

		for (int x = 0; x < N; x++) {
			produtos = sc.nextInt();
			quantidade = sc.nextInt();

			if (produtos == 1001)
				valor = 1.50;
			else if (produtos == 1002)
				valor = 2.50;
			else if (produtos == 1003)
				valor = 3.50;
			else if (produtos == 1004)
				valor = 4.50;
			else if (produtos == 1005)
				valor = 5.50;

			res += valor * quantidade;
		}
		System.out.printf("%.2f\n", res);
		sc.close();
	}
}
