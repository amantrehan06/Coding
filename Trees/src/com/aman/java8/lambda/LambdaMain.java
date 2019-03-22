package com.aman.java8.lambda;

public class LambdaMain {

	public static void main(String[] args) {
		
		LambdaInterface lambda = (a,b) -> a+b;
		
		System.out.println(lambda.add(10, 20));
	}

}
