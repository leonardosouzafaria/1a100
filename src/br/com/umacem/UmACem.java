/**
 * 
 */
package br.com.umacem;

import javax.swing.JOptionPane;

/**
 * @author leonardo
 *
 */
public class UmACem {

	public static void main(String args[]) {

		int numero = Integer.parseInt(JOptionPane
				.showInputDialog("Informe seu número de 0 a 100 para que eu possa realizar uma busca binaria."));

		int resultado = preparaBusca(numero);
		
		JOptionPane.showInputDialog("O numero que você informou é: " + resultado);

	}

	public static int preparaBusca(int numero) {
		int[] vetor = montaVetor();
		int maior = pegarMaior(vetor);
		int menor = pegaMenor(vetor);

		return buscaBinaria(numero, menor, maior);
	}

	public static int buscaBinaria(int numero, int menor, int maior) {

		int metade = maior / 2;

		if (numero == maior) {
			numero = maior;

		} else if (numero == menor) {
			numero = menor;
		} else {

			if (numero > metade) {

				menor = maior / 2;
				buscaBinaria(numero, menor, maior);

			} else if (numero < metade) {

				maior = metade;
				buscaBinaria(numero, menor, maior);

			} else {

				numero = metade;

			}

		}

		return numero;

	}

	public static int[] montaVetor() {

		// vetor
		int[] vetor = new int[100];
		int valores = 1;

		// populando vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = valores++;
			// System.out.println(vetor[i]);
		}

		return vetor;
	}

	public static int pegarMaior(int[] vetor) {
		int maior = vetor[99];
		return maior;
	}

	public static int pegaMenor(int[] vetor) {
		int menor = vetor[0];
		return menor;
	}

}
