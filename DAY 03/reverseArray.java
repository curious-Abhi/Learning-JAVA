// Challenge 1: Reverse an Array
// Task: Write a Java program to reverse the elements of an array.


public class reverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        for(int i=0; i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        

    }
}
