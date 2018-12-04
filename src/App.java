import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class App {

	public static void main(String args[]) {
		File arq = new File(args[0]);
		GeneralTreeOfChar arvore = new GeneralTreeOfChar();
		FileRead read = new FileRead();
		read.fileReader(arq,arvore);
		int opcao;
		String children = "";
		String significado = "";
		String palavra = "";
		do {
			opcao = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite um número inteiro abaixo\n"+
					"1 - Pesquisar a partir de caracter\n" +
					"2 - Pesquisar diretamente uma palavra e receber seu significado\n"+
					"3 - Sair"));
			switch (opcao) {
				case 3:
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "Os filhos são" + children);
					break;
				case 2:
					palavra = javax.swing.JOptionPane.showInputDialog("Digite a palavra que deseja procurar");
					significado = arvore.searchWords(palavra);
					JOptionPane.showMessageDialog(null, "O significado da palavra "+palavra+" : "+ significado);
					break;
				default:
					JOptionPane.showMessageDialog(null, "A opção digitada é invalida.\n Escolha uma opção válida para continuar.");
			}
		} while (opcao != 3);

	}
	/*public static void menuMain(){
		int opcao;
		String children = "";
		String significado = "";
		do {
			opcao = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite um número inteiro abaixo"+
					"1 - Pesquisar a partir de caracter\n" +
					"2 - Pesquisar diretamente uma palavra e receber seu significado\n"+
					"3 = Sair"));
			switch (opcao) {
				case 1:
					JOptionPane.showMessageDialog(null, "A comissÃ£o Ã©: " + children + " R$");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "O significado da palavra é: " + significado);
					break;
				default:
					JOptionPane.showMessageDialog(null, "A opção digitada é invalida.\n Escolha uma opção válida para continuar.");
			}
		} while (opcao != 3);
	}
}*/

 

}
