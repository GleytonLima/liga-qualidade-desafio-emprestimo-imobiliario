package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.List;

public class Solucao {

	public static String processMessages(List<String> messages) {
		
		for (String string : messages) {
			System.out.println(string);
		}
		
		filterInput(messages);
		
		return "";
	}
	
	public static void filterInput(List<String> messages){
		
		/*
		 * i did'nt found a way to run the list to filter and validate the proposal;
		 */
		
	}

}