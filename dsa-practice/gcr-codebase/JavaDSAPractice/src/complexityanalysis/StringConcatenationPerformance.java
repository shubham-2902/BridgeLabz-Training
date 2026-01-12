package complexityanalysis;

public class StringConcatenationPerformance{

    //using String
    public static void useString(int n){
        String str="";
        long start=System.nanoTime();

        for(int i=0;i<n;i++){
            str=str+"hello";


        }

        long end=System.nanoTime();
        System.out.println("String Time       : "+(end-start)+" ns");
    }

    //using StringBuilder
    public static void useStringBuilder(int n){
        StringBuilder sb=new StringBuilder();
        long start=System.nanoTime();

        for(int i=0;i<n;i++){
            sb.append("hello");
        }

        long end=System.nanoTime();
        System.out.println("StringBuilder Time: "+(end-start)+" ns");
    }

    //using StringBuffer
    public static void useStringBuffer(int n){
        StringBuffer sb=new StringBuffer();
        long start=System.nanoTime();

        for(int i=0;i<n;i++){
            sb.append("hello");
        }

        long end=System.nanoTime();
        System.out.println("StringBuffer Time : "+(end-start)+" ns");
    }

    //main method
    public static void main(String[] args){

        int n=1_000_000; //change to 1000 or 10000 for testing

        System.out.println("Operations Count: "+n+"\n");

        useString(n);
        useStringBuilder(n);
        useStringBuffer(n);
    }
}