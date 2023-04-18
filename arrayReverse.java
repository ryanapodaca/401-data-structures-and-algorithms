public class arrayReverse {
  public static void main(String[] args) {
    int[]  firstArray = {1, 2, 3, 4, 5, 6};
    int[]  secondArray = {89, 2354, 3546, 23, 10, -923, 823, -12};
    int[]  thirdArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

   reverseArray(firstArray);
   reverseArray(secondArray);
   reverseArray(thirdArray);
  }

  public static void reverseArray(int[] array) {
      int length = array.length;

      for (int i = 0; i < length/2; i++) {
        int temp = array[i];
        array[i] = array[length-i-1];
        array[length -i -1] = temp;
      }
      for (int i = 0; i <length; i++){
        System.out.println(array[i]);
      }
   
  }

}