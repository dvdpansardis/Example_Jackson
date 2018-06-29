package br.com.jacksonsandbox;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		RG rg = new RG();
		
		pessoa.setRg(rg);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		try {
			String valueAsString = objectMapper.writeValueAsString(pessoa);
			System.out.println(valueAsString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}

}
