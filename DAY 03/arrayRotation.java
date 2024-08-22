public class arrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of positions to rotate
        int n = arr.length;
        int[] rotatedArray = new int[n];
        
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k) % n] = arr[i];
        }
        
        for (int i : rotatedArray) {
            System.out.print(i + " ");
        }
    }
} 



