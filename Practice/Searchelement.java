package Practice;
public class Searchelement {

    public static void search(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                System.out.println("Element found at index " + i + " " + arr[i]);
                return;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        int arr[] = {12, 78, 90, 96};
        int key = 78;
        search(arr, key);
        
    }
}