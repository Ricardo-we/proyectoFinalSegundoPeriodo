
package terminal;

import java.util.Scanner;


public class aritmeticaSimple {
    
    Scanner scn = new Scanner(System.in);
    double val1, val2;
    
    public aritmeticaSimple(){  }
    
    public double suma(){
        System.out.println("numero 1");
        val1 = scn.nextDouble();
        
        System.out.println("numero 2");
        val2 = scn.nextDouble();
        
        return val1 + val2;
    }
    
    public double multiplicacion(){
        System.out.println("numero 1");
        val1 = scn.nextDouble();
        
        System.out.println("numero 2");
        val2 = scn.nextDouble();
        
        return val1 * val2;
    }
    
    public double resta(){
        System.out.println("numero 1");
        val1 = scn.nextDouble();
        
        System.out.println("numero 2");
        val2 = scn.nextDouble();
        
        return val1 - val2;
    }    
    
    public double division(){
        
        System.out.println("numero 1");
        val1 = scn.nextDouble();
        
        System.out.println("numero 2");
        val2 = scn.nextDouble();
        
        return val1 / val2;
    }            
    public double residuo(){
        System.out.println("numero 1");
        val1 = scn.nextDouble();
        
        System.out.println("numero 2");
        val2 = scn.nextDouble();
        
        return val1 % val2;
    }
    
    
    
    
    //PARTE 2222222222222222222222222222222222222222222222222222222222222222222222
    
    
    
    
    
    public static double suma2(double num1, double num2){
        return num1 + num2;
    }
    
    public static double multiplicacion2(double num1, double num2){
        return num1 * num2;
    }
    
    public static double resta2(double num1, double num2){    
        return num1 - num2;
    }    
    
    public static double division2(double num1, double num2){
        return num1 / num2;
    }            
    public static double residuo2(double num1, double num2){
        return num1 % num2;
    }
}
