package lambda;

import lambda.Tranformer;

public class LambdaDemo3 {
	public static void main(String[] args) {
		
		Tranformer tranformer = (String name) -> name.toUpperCase();
		
		System.out.println(tranformer.transform("Java"));
		
	}
}
