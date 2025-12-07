package Practice;
public class InsertElement {

    // two question 
    //  1. insert at end which teke O(1)
    //  2. insert at given index

    public static void insertEnd(int arr[],int capcity, int key){
      // check array full or not
      int len = arr.length;
      if(len > capcity){
         System.out.println("Array is full");
         return;
      }
      arr[3] = key;
      
    }
    // 2. insert at given index
    public static int insertPos(int arr[], int key, int capcity, int pos, int n){
      
      if(n == capcity){
        return n;

          
      }
      int idx = pos-1;

      for (int i = n-1; i >= idx; i--) {
          arr[i+1] = arr[i];
      }
      arr[idx] = key;
      return n+1;
    }
    // print array 
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
       int arr[] = new int[5];
       arr[0] = 56;
       arr[1] = 90;
       arr[2] = 92;
       int pos = 2;
       int capcity = 5;
       int key = 76;
       int n = 3;
      // insertEnd(arr, capcity, key);
       insertPos(arr, key, capcity, pos,n);
       printArray(arr);
    }
}
