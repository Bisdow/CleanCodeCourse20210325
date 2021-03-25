package com.example.project;

final public class NumberMapperFromTerminal {
    
	public static void main(String[] args) {
		NumberMapper mapper = new NumberMapper();
		System.out.println(mapper.mapTo(Integer.parseInt(args[0]), args[1]));
	}

}
