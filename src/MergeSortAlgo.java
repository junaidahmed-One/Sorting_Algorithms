import java.util.Arrays;

public class MergeSortAlgo {
    public static void main(String[] args) {
        int[] arr = {9,3,4,4,4,4,1,6,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted array:");
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length+right.length];
        int i = 0,j = 0,k = 0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                merged[k++] = left[i++];
            }else{
                merged[k++] = right[j++];
            }
        }
        while(i<left.length){
            merged[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }
}

