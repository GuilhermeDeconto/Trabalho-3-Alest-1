import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileRead {

	public void fileReader(File arq, GeneralTreeOfInteger tree){
		try {
			//String que irá receber cada linha do arquivo
			String line = "";
			int lineCounter = 0;
			//Indicamos o arquivo que será lido
			BufferedReader br = new BufferedReader(new FileReader(arq));

			while ((line = br.readLine()) != null) {
				lineCounter++;
				System.out.println(lineCounter + " Linha: " + line);
				populateTree(line, tree);
			}
			br.close();
		} catch (java.io.IOException e) {
			System.out.println("FILE READING ERROR: " + e);
		}
	}
	private void populateTree(String line, GeneralTreeOfInteger tree){
		//ADICIONAR OS DADOS DO ARQUIVO NA ARVORE...
	}
}
