package Practice;
public class ReverseArrays {

    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
       int arr[] = {12, 67, 89, 90};
       reverse(arr);
       printArray(arr);
    }
}
