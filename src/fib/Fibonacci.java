/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fib;

/**
 *
 * @author Sarantis
 */

public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public int[] value;
    public int[][] A;
    public int count,count1,count2;
    
    public Fibonacci(int element)
    {
        value = new int[element+1];
        count = 0;
        count1 = 0;
        count2 = 0;
        A = {"1","1"};
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci(10);
        System.out.println(f.Fibonacci(30,0,1,0)+"\n"+f.count+"\n"+f.fibonacciRecursive(30)+"\n"+f.count1);
    }
    
    public int Fibonacci(int element)
    {
        count++;
        if(element==2)
        {
            value[element] = 1;
            value[element-1] = 1;
            value[element+1] = value[element]+value[element-1];
            return element;
        }
        Fibonacci(element-1);
        value[element+1] = value[element]+value[element-1];
        return value[element+1];
    }
    
    public int Fibonacci(int element,int n,int nn1,int pos)
    {
        count++;
        if(pos+2 == element)
            return (n+nn1);
        return Fibonacci(element,nn1,n+nn1,pos+1);
    }
    
    public int FibonacciR(int element,int n,int nm1,int pos)
    {
        count++;
        int nn1 = n+nm1;
        //System.out.println(pos+"\n"+element);
        if(pos+1 == element)
            return (nn1);
        if(pos+2 == element)
            return (n+nn1);
        return FibonacciR(element,nn1+n,nn1,pos+2);
    }
    
    public int fibonacciRecursive(int n)
    {
        count1++;
        if(n == 1 || n == 2) return 1;
        else return fibonacciRecursive(n-2) + fibonacciRecursive(n-1);
    }
    public int[][] fib(int k)
    {
        return new int[10][10];
    }
    
    public int[][] matrixmult(int[][] z,int[][] x)
    {
        int[][] resultant = new int[2][2];
 
        for(int i = 0; i < 2; i++) { // aRow
            for(int j = 0; j < 2; j++) { // bColumn
                for(int k = 0; k < 2; k++) { // aColumn
                    resultant[i][j] += z[i][k] * x[k][j];
                }
            }
        }
        return resultant;
    }

            
}
