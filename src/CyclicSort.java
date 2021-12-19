import java.util.Arrays;

public class CyclicSort {
    public static void sort(int[] ar){
        int n = ar.length;
        int i = 0;
        while(i<n){
            int correct = ar[i]-1;
            if(ar[i]!=ar[correct]){
                swap(ar,i,correct);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] ar, int i, int correct) {
        int temp = ar[i];
        ar[i] = ar[correct];
        ar[correct] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
