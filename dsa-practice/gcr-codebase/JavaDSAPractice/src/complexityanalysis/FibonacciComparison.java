package complexityanalysis;
public class FibonacciComparison{

    //recursive fibonacci (O(2^n))
    public static int fibonacciRecursive(int n){
        if(n<=1){


            return n;
        }
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }

    //iterative fibonacci (O(n))
    public static int fibonacciIterative(int n){
        if(n<=1){
            return n;
        }
        int a=0,b=1,sum=0;
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }

    //main method
    public static void main(String[] args){

        int n=30; //change to 10, 30, 50 to test

        //recursive timing
        long startRec=System.nanoTime();
        int recResult=fibonacciRecursive(n);
        long endRec=System.nanoTime();

        //iterative timing
        long startItr=System.nanoTime();
        int itrResult=fibonacciIterative(n);
        long endItr=System.nanoTime();

        System.out.println("Fibonacci Number (N): "+n);
        System.out.println("Recursive Result  : "+recResult);
        System.out.println("Iterative Result  : "+itrResult);

        System.out.println("\nTime Taken:");
        System.out.println("Recursive Time : "+(endRec-startRec)+" ns");
        System.out.println("Iterative Time : "+(endItr-startItr)+" ns");
    }
}