package Algorithms;

public class search_inrange {
    public static void main(String[] args) {
        int array[] = {44, 67, 2, 11, 9, 6, 3, 23, 58, 0, 7, 6, 4, 7, 2, 232, 1, 13, 9};
        int search = 7;
        int start = 1; // initializing the starting index.
        int end = 18;  // initializing the ending index.
        search1(array,search, start, end);  // calling the function.
    }

    static void search1(int arr[], int element, int start, int end) {

        if (arr.length == 0) {
            System.out.println(" the array is empty");
        } else{
            for (int i = start; i < end; i++) {
                if (arr[i] == element) {   // condition for checking the element.
                    System.out.println(" the element " +element+ " is found at index " + i);

                }
            }

        }
    }

}
