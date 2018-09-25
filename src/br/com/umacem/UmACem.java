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
	
	//Main
	public static void main(String[] args) {
		//Inicia jogo
		if (!iniciaJogo()) {
			JOptionPane.showInputDialog("Obrigado e volte Sempre!");
			System.exit(0);
		};
		
		iniciaPalpites();
	}
	
	//Métodos
	
	public static int iniciaPalpites() {
		
		String palpite = JOptionPane.showInputDialog("O número que você pensou é maior ou menor que 50?");
		
		if(palpite.toLowerCase().equals("sim")) {
			maiorQue50();
		} else {
			menorQue50();
		}
		return 0;
	}

	private static void menorQue50() {
		// TODO Auto-generated method stub
		
	}

	private static void maiorQue50() {
		// TODO Auto-geneated method stub
		
	}

	public static boolean iniciaJogo() {
		
		String confirmacao = JOptionPane.showInputDialog("Pense em um número de 1 a 100. \n"
				+ "Insira Sim para continuar ou Sair para sair.");
		
		confirmacao = confirmacao.toLowerCase();
		
		if(confirmacao.equals("sim")) {
			return true;
		} else if(!confirmacao.equals("sair")) {
			iniciaJogo();
		}
		return false;
	}
	
	

}
