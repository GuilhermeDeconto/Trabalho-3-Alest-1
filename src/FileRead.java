import java.io.*;
import java.util.*;

public class FileRead {

	public void fileReader(File arq, GeneralTreeOfChar tree){
		try {
			//String que irá receber cada linha do arquivo
			String line = "";
			int lineCounter = 0;
			//Indicamos o arquivo que será lido
			BufferedReader br = new BufferedReader(new FileReader(arq));

			while ((line = br.readLine()) != null) {
				//lineCounter++;
				//System.out.println(lineCounter + " Linha: " + line);
				populateTree(line, tree);
			}
			br.close();
		} catch (java.io.IOException e) {
			System.out.println("FILE READING ERROR: " + e);
		}
	}
	private void populateTree(String line, GeneralTreeOfChar tree) {

		//ADICIONAR OS DADOS DO ARQUIVO NA ARVORE...
		char aux, ling;
		StringTokenizer tokenizer = new StringTokenizer(line,";");
		while (tokenizer.hasMoreTokens()){
			String actual = tokenizer.nextToken();
			String after = tokenizer.nextToken();
			tree.insert(actual, after);
			//System.out.println("Inserido nodo: "+actual+" Frase do nodo: "+after);
		}
	}
}
