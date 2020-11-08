class Main {
//Climbing Stairs: Given an integer representing the number of stairs, write a function that determines how many possible ways one could climb the stairs given they can take 1, 2, or 3 steps at any given point.
  public static int climbingStairs(int numStairs){
      int[] cache = new int[numStairs+1];
      cache[0] = 0;
      cache[1] = 1;
      cache[2] = 2;
      cache[3] = 4;
      for(int i =4; i<=numStairs; i++) {
        cache[i] = cache[i-1] + cache[i-2] + cache[i-3];
      } 
      return cache[numStairs];     
  }

//Maximum Sum Subarray: Given an array of integers (positive & negative), write a function that returns the sum of the contiguous subarray that has the maximum sum. (Do not need to return the array itself).


  //calculates the sum of all the elements in an array
  public static int sumArray(int[] array){
      int sum = 0;
      for(int k = 0; k < array.length; k++){
        sum = sum + array[k];
      }
      return sum;
  }
  public static int maxSumSub(int[] array){
      int curSum = sumArray(array);
      int[] lastRemoved = new int[array.length - 1];
      int[] firstRemoved = new int[array.length - 1];
      for(int i = 0; i < array.length - 1; i++){
        lastRemoved[i] = array[i];
      }
      maxSumSub(lastRemoved);
      for(int j = 1; j < array.length; j++){
        firstRemoved[j] = array[j];
      }
      maxSumSub(firstRemoved);
  }
  public static int maxSumOf(int[] array, int curMaxSum){
    
  }

  public static int maxSumSub(int[] array){
      int maxsum = array[0];
      int currentsum = maxsum;
      for (int i =0; i<array.length; i++) {
      currentsum = Math.max(array[i]+currentsum, array[i]);
      maxsum = Math.max(currentsum, maxsum);
      }
      return maxsum;
  }

  //Maximum Product Rope Cutting: Given a rope of length n meters, cut the rope in different parts of integer lengths in a way that maximizes product of lengths of all parts. You must make at least one cut. Assume that the length of rope is more than 2 meters. (You can return the maximum product)
  public static int maxProdRope(int n){
    int max = n;
    for (int i =2; i<n; i++) {
      max = Math.max(max, i*(maxProdRope(n-i)));
    }
    return max;
  }


  public static void main(String[] args) {
    // System.out.println(climbingStairs(4));
    // System.out.println(climbingStairs(4));


  }
}