package complexityanalysis;
import java.util.Arrays;

public class SearchPerformanceComparison{

    //linear search
    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){


                return i;
            }
        }
        return -1;
    }

    //binary search
    public static int binarySearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }

    //main method 
    public static void main(String[] args){

        int size=1_000_000;
        int[] data=new int[size];

        //fill dataset
        for(int i=0;i<size;i++){
            data[i]=i;
        }

        int target=size-1;

        //linear search timing
        long startLinear=System.nanoTime();
        linearSearch(data,target);
        long endLinear=System.nanoTime();

        //binary search timing
        Arrays.sort(data);
        long startBinary=System.nanoTime();
        binarySearch(data,target);
        long endBinary=System.nanoTime();

        System.out.println("Dataset Size - "+size);
        System.out.println("Linear Search Time - "+(endLinear-startLinear)+" ns");
        System.out.println("Binary Search Time - "+(endBinary-startBinary)+" ns");
    }
}