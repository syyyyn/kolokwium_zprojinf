package quicksort;

import java.util.Arrays;



/**
 *
 * @author michalsynowiec
 */
public class QuickSort {
    
    /**
     *
     * @param a
     *  
     */
    
    
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /*
             In each iteration, we will identify a number from left side which
             is greater then the pivot value, and also we will identify a number
             from right side which is less then the pivot value. Once the search
             is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    //method that is exchanging numbers while sorting 
    
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
        
        
        //Creating sorter object to call sord method on an array
        QuickSort sorter = new QuickSort();
        //create array to be sorted
        int[] arrayUnsorted = {9,7,5,11,12,2,14,3,10,6};
        //Method sort which is sorting given array is called
        sorter.sort(arrayUnsorted);
        
        System.out.println(Arrays.toString(arrayUnsorted));
        //printing sorted array in for loop
        for(int i:arrayUnsorted){
            System.out.print(i);
            System.out.print(",");
        }

    }
}
