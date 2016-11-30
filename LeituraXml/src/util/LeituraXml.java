package util;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
 
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
 
public class LeituraXml {
 
	
	
 
	public void xml() throws JDOMException, IOException {
		
		String telefone;
		String mensagem;
		String email;
		// caminho do arquivo deve sear completo
		
		File file = new File("C:\\Users\\Suporte_ti\\Desktop\\xml\\fone.xml");
 
		// Criamos uma classe SAXBuilder que vai processar o XML4
		SAXBuilder sb = new SAXBuilder();
 
		// Este documento agora possui toda a estrutura do arquivo.
		Document estrutura = sb.build(file);
 
		// capturando elemento conf 
		Element dtsDB = estrutura.getRootElement();
 
		// captura a estrutura dentro do conf
		List elements = dtsDB.getChildren();
		Iterator i = elements.iterator();
 
		// Iteramos com os elementos filhos, e filhos do dos filhos
		while (i.hasNext()) {
			Element element = (Element) i.next();
			telefone = element.getChildText("TELEFONE");
			mensagem = element.getChildText("MENSAGEM");
			email = element.getChildText("EMAIL");
			
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println(telefone);
			System.out.println(mensagem);
			System.out.println(email);
			System.out.println("------------------------------------------------------------------------------------------------\n");
		}
	}
}