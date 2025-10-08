package Practice;
public class DeleteElementArray {
    public static int delete(int arr[], int key, int n){
      int i = 0;
      for (i = 0; i < n; i++) {
          if(arr[i] == key){
            break;
          }
      }
      if(i == n){
        return n;
      }
      
      for (int j = i; j < n-1; j++) {
        arr[j] = arr[j+1];
      }
      return n-1;
    } 
    public static void main(String[] args) {
       int arr[] = {23, 89, 90, 92};
       int n = 4;
       int key = 90;
       System.out.println(delete(arr, key, n));
    }
}