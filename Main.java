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
      return cache[numStairs];     // cache[2] = 2;
  }


  public static void main(String[] args) {
    System.out.println(climbingStairs(4));
    System.out.println(climbingStairs(4));


  }
}