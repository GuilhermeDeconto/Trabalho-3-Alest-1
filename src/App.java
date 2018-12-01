import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

    public static void main(String args[]) {
    	File arq = new File(args[0]);
        GeneralTreeOfInteger arvore = new GeneralTreeOfInteger();
	    FileRead read = new FileRead();
	    read.fileReader(arq,arvore);
	    //read.fileReader(args[0],arvore);
        /*
        arvore.add(0,null);
        arvore.add(1,0);
        arvore.add(2,0);
        arvore.add(3,0);
        arvore.add(4,1);
        arvore.add(5,2);
        arvore.add(6,2);
        arvore.add(7,2);
        */
        //arvore.add('B','A',"");
	    //arvore.add('C','B', "UAHUEA");
        //System.out.println("Elementos da arvore: caminhamento em largura:");
        //System.out.println(arvore.positionsWidth());
        
        //System.out.println("Elementos da arvore: caminhamento pre:");
        //System.out.println(arvore.positionsPre());
    }

 

}
