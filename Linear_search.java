package Algorithms;

import java.util.Scanner;

public class Linear_search {

     public static void main(String[] args) {

         // program to find a given no using linear search.

         int[] num = {34, 323, 6, 12, 88, 9, 44, 11, 2, 1, 7, 8, 45, 6, 7};
         int target = 11;
          linear_search(num,target);

     }
     // function to search a number using linear search
        static void linear_search(int arr[], int target){
            if(arr.length==0){
                System.out.println( " the array is empty ");
            }
            for(int i=0;i< arr.length;i++){
                if(arr[i]==target){
                    System.out.println(" the number "+target+ " is found at index "+i);

                }
            }
        }
}