package org.amdocs.lab2.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	Substraction substraction = new Substraction();
	double result = substraction.evaluate(3,2);
	System.out.println(result);
    }
}

