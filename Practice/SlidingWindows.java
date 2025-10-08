package Practice;
public class SlidingWindows {

    // The Sliding Window Technique is a powerful algorithmic paradigm
    // used to solve problems involving subarrays or substrings. 
    // It works by maintaining a "window" of a specific size that slides through the input array or string.


    //   Problem: Given an array of integers and an integer k, 
    //   find the maximum sum of any contiguous subarray of size k.

    public static int slidingwindows(int arr[], int k){
      if(k > arr.length){
         return -1;
      }
      int windowSum = 0;
      int maxSum = 0;
      // Calculate sum of first k elements
      for (int i = 0; i < k; i++) {
          windowSum += arr[i];
      }
      maxSum = windowSum;
      
      // Slide the window
      for (int i = k; i < arr.length; i++) {
          windowSum = windowSum - arr[i-k] + arr[i];  // Remove first element and add next element
          maxSum = Math.max(maxSum, windowSum);
      }
      return maxSum;
    }
    public static void main(String[] args) {
       int arr[] = {12, 78, 9, 90, 78, 65, 90};
       int k = 2;
       System.out.println(slidingwindows(arr, k));
    }
}
