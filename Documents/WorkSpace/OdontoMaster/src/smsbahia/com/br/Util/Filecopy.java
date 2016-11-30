package smsbahia.com.br.Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Filecopy {
	
	

	public static void copyFile(String path) throws IOException {
	      
		  InputStream in;
		    // escreve os dados
		    OutputStream out;
		    try{
		        // arquivos que vamos copiar
		        File toFile = new File(path);
		        String file = toFile.toString();
		        file = file.replaceAll("xml2", "xml");
		        // destino para onde vamos mover o arquivo
		        File fromFile = new File(file);
		        //verifica se o arquivo existe
		        if(!fromFile.exists()){
		            //verifica se a pasta existe
		            if(!fromFile.getParentFile().exists()){
		                //cria a pasta
		                fromFile.getParentFile().mkdir();
		            }
		            // cria o arquivo
		            fromFile.createNewFile();
		        }
		        in = new FileInputStream(toFile);
		        out = new FileOutputStream(fromFile);
		        // buffer para transportar os dados
		        byte[] buffer = new byte[1024];
		        int length;
		        // enquanto tiver dados para ler..
		        while((length = in.read(buffer)) > 0 ){
		            // escreve no novo arquivo
		            out.write(buffer, 0 , length);
		        }

		        in.close();
		        out.close();
		        //apaga o arquivo antigo
		        toFile.delete();

		    }catch(IOException e){
		        e.printStackTrace();
		    }


		}
}
