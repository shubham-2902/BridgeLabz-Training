package complexityanalysis;
import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureSearchComparison{

    //linear search in array
    public static boolean arraySearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }


        }
        return false;
    }

    public static void main(String[] args){

        int size=1_000_000; //change to 1000 or 100000 for testing
        int target=size-1;

        int[] arr=new int[size];
        HashSet<Integer> hashSet=new HashSet<>();
        TreeSet<Integer> treeSet=new TreeSet<>();

        //fill data structures
        for(int i=0;i<size;i++){
            arr[i]=i;
            hashSet.add(i);
            treeSet.add(i);
        }

        //Array search timing
        long start=System.nanoTime();
        arraySearch(arr,target);
        long end=System.nanoTime();
        System.out.println("Array Search Time   : "+(end-start)+" ns");

        //HashSet search timing
        start=System.nanoTime();
        hashSet.contains(target);
        end=System.nanoTime();
        System.out.println("HashSet Search Time : "+(end-start)+" ns");

        //TreeSet search timing
        start=System.nanoTime();
        treeSet.contains(target);
        end=System.nanoTime();
        System.out.println("TreeSet Search Time : "+(end-start)+" ns");
    }
}