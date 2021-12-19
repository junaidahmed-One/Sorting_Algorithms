import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {8,6,4,0,3,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        //Store the max value at the end
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            //Get the max value index and swap it with last value index in the given range
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    private static int getMaxIndex(int[] arr,int start,int end) {
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i])
                max = i;
        }
        return max;
    }
}
