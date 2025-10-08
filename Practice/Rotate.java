package Practice;
public class Rotate {
    // two way 1. rotate time O(n) and space O(n)
    // 2. time O(n*d) space O(1)
    public static void rotate1(int arr[], int d){
        int n = arr.length;
        int temp[] = new int[n];
        int k = 0;

       for(int i=d; i<n; i++){
         temp[k] = arr[i];
         k++;
       }
       for(int i=0; i<d; i++){
        temp[k] = arr[i];
        k++;
      }

      for(int i=0; i<n; i++){
        arr[i] = temp[i];
      }
    }
    // 2 method to ratate array
    public static void rotate2(int arr[], int d){
       int p =1;
       while (p<=d) {
           int last = arr[0];
           for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
           }
           arr[arr.length-1] = last;
           p++;
       }
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {12, 78, 90, 90};
        int d = 2;
       // rotate1(arr, d);
       rotate2(arr, d);
       printArray(arr);
    }
}
