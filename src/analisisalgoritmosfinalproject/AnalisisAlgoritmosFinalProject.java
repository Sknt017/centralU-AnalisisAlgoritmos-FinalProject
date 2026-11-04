/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisisalgoritmosfinalproject;
import static analisisalgoritmosfinalproject.modeloPackage.modeloAlgoritmos.selectionSort;
import java.util.Scanner;// Main class for the application


/**
 *
 * @author dasan
 */
public class AnalisisAlgoritmosFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ArrayLenght;
        try ( // int[] arr = {};
        // selection sort algorithm
        //get execution time for the methos SelectionSort
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter array lenght: ");
            ArrayLenght = scanner.nextInt();
        }
        int[] arr = new int[ArrayLenght];
        for(int i = 0; i < ArrayLenght; i++) {
            arr[i] = (int)(Math.random() * 1000); // Fill the array with random numbers between 0 and 99
        }
        long startTime = System.nanoTime();
        selectionSort(arr);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Array  (sorted): " + java.util.Arrays.toString(arr));
        System.out.println("Array lenght: "+ arr.length);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
    
    
}
