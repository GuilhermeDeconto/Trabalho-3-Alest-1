import java.io.File;

public class App {

    public static void main(String args[]) {
    	File arq = new File(args[0]);
        GeneralTreeOfChar arvore = new GeneralTreeOfChar();
	    FileRead read = new FileRead();
	    read.fileReader(arq,arvore);
	    //System.out.println(arvore.searchAux("Br"));
	    System.out.println(arvore.search("Fernanda"));
	    System.out.println(arvore.searchWords("Breno"));
	    System.out.println(arvore.searchWords("Pedro"));
	    /*

        arvore.insert("joana","GOSTOSA");
        arvore.insert("gustavo","TOP");
        arvore.insert("lucas","ARMAZEM");
        System.out.println("Primeiro boolean: "+arvore.search("gustavo"));
	    System.out.println("Segundo boolean: "+arvore.search("lucas"));
	    System.out.println("Terceiro boolean: "+arvore.search("joana"));
	    System.out.println("Quarto boolean: "+arvore.searchNode("gus"));
	    System.out.println(arvore.count);
	    System.out.println("Joana é: "+av);
*/

    }


 

}
