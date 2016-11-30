package smsbahia.com.br.Util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PegaDados {
	
	public ArrayList<String> getLinhasArquivo( String file ) throws FileNotFoundException, IOException{
	    ArrayList<String> linhas;
	        
	    try (BufferedReader leitor = new BufferedReader( new FileReader(file) )) {
	       linhas = new ArrayList<>();
	       String linha = "";
	            
	       while( (linha = leitor.readLine()) != null ){
	          if( linha.length() > 0 )
	              linhas.add(linha);
	       }
	    }
	    return linhas;
	}


	}


