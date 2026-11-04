/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisisalgoritmosfinalproject.modeloPackage;

/**
 *
 * @author dasan
 */
public class modeloAlgoritmos {
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        System.out.println("Received unsorted array: "+java.util.Arrays.toString(arr));
        for(int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }    
        return arr;
    }    
}