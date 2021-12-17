package program;

import exceptions.FTExceptions;
import lexico.Token;
import sintatico.Sintatico;
import lexico.Lexicon; 

public class Main {

	public static void main(String[] args) {
		Lexicon lex = new Lexicon("C:/Users/Jonas/Documents/UFAL/Compiladores/src/program/input.txt");
		Token tk = null;
		try {
			//String path = "";
			Sintatico sint = new Sintatico(args[0]);
					
		}catch(FTExceptions ft) {
			System.out.println("Erro Lexico:"+ft.getMessage());
		}catch(Exception ex) {
			System.out.println("Erro comum");
		}
	}

}
