import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[] = {32,8,0,-4,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            //After a pass if nothing is swapped then array is sorted
            if(!swapped){
                break;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
