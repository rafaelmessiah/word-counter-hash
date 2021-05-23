package contadorDePalavras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ContadorHash {

	public static void main(String[] args) {

		try {ArrayList<String> Stopwords = new ArrayList<String>();

		Stopwords.add("de");Stopwords.add("a");Stopwords.add("o");Stopwords.add("que");Stopwords.add("e");Stopwords.add("do");Stopwords.add("da");Stopwords.add("em");Stopwords.add("um");Stopwords.add("para");
		Stopwords.add("�");Stopwords.add("com");Stopwords.add("n�o");Stopwords.add("uma");Stopwords.add("os");Stopwords.add("no");Stopwords.add("se");Stopwords.add("na");Stopwords.add("por");Stopwords.add("mais");
		Stopwords.add("as");Stopwords.add("dos");Stopwords.add("como");Stopwords.add("mas");Stopwords.add("foi");Stopwords.add("ao");Stopwords.add("ele");Stopwords.add("das");Stopwords.add("tem");Stopwords.add("�");
		Stopwords.add("seu");Stopwords.add("sua");Stopwords.add("ou");Stopwords.add("ser");Stopwords.add("quando");Stopwords.add("muito");Stopwords.add("h�");Stopwords.add("nos");Stopwords.add("j�");Stopwords.add("est�");
		Stopwords.add("eu");Stopwords.add("tamb�m");Stopwords.add("s�");Stopwords.add("pelo");Stopwords.add("pela");Stopwords.add("at�");Stopwords.add("isso");Stopwords.add("ela");Stopwords.add("entre");Stopwords.add("era");
		Stopwords.add("depois");Stopwords.add("sem");Stopwords.add("mesmo");Stopwords.add("aos");Stopwords.add("ter");Stopwords.add("seus");Stopwords.add("quem");Stopwords.add("nas");Stopwords.add("me");Stopwords.add("esse");
		Stopwords.add("eles");Stopwords.add("est�o");Stopwords.add("voc�");Stopwords.add("tinha");Stopwords.add("foram");Stopwords.add("essa");Stopwords.add("num");Stopwords.add("nem");Stopwords.add("suas");Stopwords.add("meu");
		Stopwords.add("�s");Stopwords.add("minha");Stopwords.add("t�m");Stopwords.add("numa");Stopwords.add("pelos");Stopwords.add("elas");Stopwords.add("havia");Stopwords.add("seja");Stopwords.add("qual");Stopwords.add("ser�");
		Stopwords.add("n�s");Stopwords.add("tenho");Stopwords.add("lhe");Stopwords.add("deles");Stopwords.add("essas");Stopwords.add("esses");Stopwords.add("pelas");Stopwords.add("este");Stopwords.add("fosse");Stopwords.add("dele");
		Stopwords.add("tu");Stopwords.add("te");Stopwords.add("voc�s");Stopwords.add("vos");Stopwords.add("lhes");Stopwords.add("meus");Stopwords.add("minhas");Stopwords.add("teu");Stopwords.add("tua");Stopwords.add("teus");Stopwords.add("tuas");
		Stopwords.add("nosso");Stopwords.add("nossa");Stopwords.add("nossos");Stopwords.add("nossas");Stopwords.add("dela");Stopwords.add("delas");Stopwords.add("esta");Stopwords.add("estes");Stopwords.add("estas");Stopwords.add("aquele");
		Stopwords.add("aquela");Stopwords.add("aqueles");Stopwords.add("aquelas");Stopwords.add("isto");Stopwords.add("aquilo");Stopwords.add("estou");Stopwords.add("est�");Stopwords.add("estamos");Stopwords.add("est�o");Stopwords.add("estive");
		Stopwords.add("esteve");Stopwords.add("estivemos");Stopwords.add("estiveram");Stopwords.add("estava");Stopwords.add("est�vamos");Stopwords.add("estavam");Stopwords.add("estivera");Stopwords.add("estiv�ramos");Stopwords.add("esteja");
		Stopwords.add("estejamos");Stopwords.add("estejam");Stopwords.add("estivesse");Stopwords.add("estiv�ssemos");Stopwords.add("estivessem");Stopwords.add("estiver");Stopwords.add("estivermos");Stopwords.add("estiverem");Stopwords.add("hei");
		Stopwords.add("h�");Stopwords.add("havemos");Stopwords.add("h�o");Stopwords.add("houve");Stopwords.add("houvemos");Stopwords.add("houveram");Stopwords.add("houvera");Stopwords.add("houv�ramos");Stopwords.add("haja");Stopwords.add("hajamos");
		Stopwords.add("hajam");Stopwords.add("houvesse");Stopwords.add("houv�ssemos");Stopwords.add("houvessem");Stopwords.add("houver");Stopwords.add("houvermos");Stopwords.add("houverem");Stopwords.add("houverei");Stopwords.add("houver�");
		Stopwords.add("houveremos");Stopwords.add("houver�o");Stopwords.add("houveria");Stopwords.add("houver�amos");Stopwords.add("houveriam");Stopwords.add("sou");Stopwords.add("somos");Stopwords.add("s�o");Stopwords.add("era");Stopwords.add("�ramos");
		Stopwords.add("eram");Stopwords.add("fui");Stopwords.add("foi");Stopwords.add("fomos");Stopwords.add("foram");Stopwords.add("fora");Stopwords.add("f�ramos");Stopwords.add("seja");Stopwords.add("sejamos");Stopwords.add("sejam");Stopwords.add("fosse");
		Stopwords.add("f�ssemos");Stopwords.add("fossem");Stopwords.add("for");Stopwords.add("formos");Stopwords.add("forem");Stopwords.add("serei");Stopwords.add("ser�");Stopwords.add("seremos");Stopwords.add("ser�o");Stopwords.add("seria");
		Stopwords.add("ser�amos");Stopwords.add("seriam");Stopwords.add("tenho");Stopwords.add("tem");Stopwords.add("temos");Stopwords.add("t�m");Stopwords.add("tinha");Stopwords.add("t�nhamos");Stopwords.add("tinham");Stopwords.add("tive");Stopwords.add("teve");
		Stopwords.add("tivemos");Stopwords.add("tiveram");Stopwords.add("tivera");Stopwords.add("tiv�ramos");Stopwords.add("tenha");Stopwords.add("tenhamos");Stopwords.add("tenham");Stopwords.add("tivesse");Stopwords.add("tiv�ssemos");Stopwords.add("tivessem");
		Stopwords.add("tiver");Stopwords.add("tivermos");Stopwords.add("tiverem");Stopwords.add("terei");Stopwords.add("ter�");Stopwords.add("teremos");Stopwords.add("ter�o");Stopwords.add("teria");Stopwords.add("ter�amos");Stopwords.add("teriam");
		
		FileReader receita = new FileReader("D:\\Google Drive\\Sistemas de Informa��o UP\\4� Semestre\\Desenvolvimento de Software III\\Contador de Palavras Hashmap\\Receita.txt");
		
		BufferedReader arquivo = new BufferedReader(receita);
		
		HashMap<String, Integer> contador = new HashMap<String, Integer>();

		
		String Linha = "";
		
		while (Linha != null) {//Vai ler o arquivo linha por linha por linha
			
			String[] palavrasLinha = Linha.split(" ");//Vai pegar a linha  e separar em uma tring
			
			for (String p : palavrasLinha) {
				if (Stopwords.contains(p.toLowerCase())) {//Se a palavra estiver no Stopwords ele para a analise
					break;
				}else {
					if (contador.get(p)==null) {//Verifica se a palavra ja est� l�, 
						contador.put(p, 1);//se nao estiver vai adicionar
					}else {
						contador.put(p, (contador.get(p)+1));//Valore Recebe +1
					}
				}
			}
			Linha = arquivo.readLine();//Vai receber cada linha do arquivo
		}
		
		for(Entry<String, Integer> e : contador.entrySet()) {
			System.out.println(e.getKey()+"--"+e.getValue());
		}
		
		
		

		






		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
