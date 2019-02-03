package mergesort;

import java.util.Arrays;

/**
 * Created by mhan on 2/4/2017.
 */
public class MergeSort {
    public static void main(String[] args){
        int [] nums = Utils.randomArray(10, 30);
        System.out.println("before sorting: " + Arrays.toString(nums));
        mergeSort(nums);
        System.out.println("after sorting: " + Arrays.toString(nums));
    }

    public static void mergeSort(int[] a){
        if(a.length <= 1) return; //explicit base case!
        //Write your code here
        //1) split into left and right
        int[] left = Arrays.copyOfRange(a, 0, a.length/2);
        int[] right = Arrays.copyOfRange(a, a.length/2, a.length);

        //2) sort left and sort right
        mergeSort(left);
        mergeSort(right);

        //3) merge the sorted left and sorted right in a way that is sorted
        merge(a, left, right);
    }

    //pre: array a's length is left's length + right's length
    //     left and right is already sorted
    //post: array a is sorted in non-decreasing order with left and right element
    private static void merge(int[] a, int[] left, int[] right){
        //write your code here
        int indexL = 0;
        int indexR = 0;

        for(int i = 0 ; i < a.length ; i++){
            //Only if left index is valid and
            //  right index is invalid or left value is smaller pick left!
            if( indexL < left.length &&
                    (indexR >= right.length || left[indexL] < right[indexR]) ){ //pick left
                a[i] = left[indexL++]; //consume left index
            } else { //otherwise pick right!
                a[i] = right[indexR++]; //consume right index
            }
        }
    }
}
