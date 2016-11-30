package smsbahia.com.br.Util;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import smsbahia.com.br.Dao.BeanDao;
 
public class LeituraXml {
 
	
	
 
	public ArrayList<BeanDao> Leitura(String caminho) throws JDOMException, IOException {
		
		ArrayList<BeanDao> list  = new ArrayList<>();
		
		File file = new File(caminho);
 
		SAXBuilder sb = new SAXBuilder();
 
		// Este documento agora possui toda a estrutura do arquivo.
		Document estrutura = sb.build(file);
 
		// capturando elemento dtsDB 
		Element dtsDB = estrutura.getRootElement();
 
		// captura a estrutura dentro do dtsDB
		List elements = dtsDB.getChildren();
		Iterator i = elements.iterator();
 
		// Iteramos com os elementos filhos, e filhos do dos filhos
		while (i.hasNext()) {
			
			BeanDao bean = new BeanDao();
			Element element = (Element) i.next();
			bean.setTelefone(element.getChildText("TELEFONE"));
			bean.setIdfornecor(element.getChildText("IDCLIENFOR"));
			bean.setNome(element.getChildText("RAZAO"));
			bean.setSexo(element.getChildText("SEXO"));
			bean.setMensagem(element.getChildText("MENSAGEM"));
			bean.setEmail(element.getChildText("EMAIL"));
			
			list.add(bean);
		}
		
		return list;
	}
}