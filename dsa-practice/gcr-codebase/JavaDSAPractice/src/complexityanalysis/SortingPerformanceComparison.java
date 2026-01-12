package complexityanalysis;
import java.util.Arrays;
import java.util.Random;

public class SortingPerformanceComparison{

    //bubble sort
    public static void bubbleSort(int[] arr){
        int n=arr.length;


        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //merge sort
    public static void mergeSort(int[] arr){
        if(arr.length<2){
            return;
        }
        int mid=arr.length/2;
        int[] left=Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
    }

    private static void merge(int[] arr,int[] left,int[] right){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            arr[k++]=(left[i]<right[j])?left[i++]:right[j++];
        }
        while(i<left.length) arr[k++]=left[i++];
        while(j<right.length) arr[k++]=right[j++];
    }

    //quick sort
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }

    //partition method 
    private static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

    public static void main(String[] args){

        int size=10000; //change size to test
        int[] data=new int[size];
        Random r=new Random();

        for(int i=0;i<size;i++){
            data[i]=r.nextInt(size);
        }

        int[] arr1=data.clone();
        int[] arr2=data.clone();
        int[] arr3=data.clone();

        //Bubble Sort
        long start=System.nanoTime();
        bubbleSort(arr1);
        long end=System.nanoTime();
        System.out.println("Bubble Sort Time: "+(end-start)+" ns");

        //Merge Sort
        start=System.nanoTime();
        mergeSort(arr2);
        end=System.nanoTime();
        System.out.println("Merge Sort Time: "+(end-start)+" ns");

        //Quick Sort
        start=System.nanoTime();
        quickSort(arr3,0,arr3.length-1);
        end=System.nanoTime();
        System.out.println("Quick Sort Time: "+(end-start)+" ns");
    }
}