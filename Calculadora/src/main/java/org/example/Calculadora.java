package org.example;

public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora (int a, String b){
        num1=a;
        num2=b;
    }

    public int suma(){
        int res=num1+num2;
        return res;
    }

    public int resta(){
        int res=num1-num2;	//error solucionado
        return res;
    }

    public int multiplica(){
        int res=num1*num2;
        return res;
    }

    public int divide(){
        if (num2 == 0) { //si el divisor es 0 lanza una excepción
            throw new java.lang.ArithmeticException("División por 0");
        }

        int res=num1/num2;	//error solucionado
        return res;
    }
}