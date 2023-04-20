package arrayBinarySearch;

public class arrayBinarySearch {
  public static void main(String[] args) {
    int[] array = {4, 8, 15, 16, 23, 42};
    
    int result = binaryReturnIndexIfIncluded(array, 15);

    System.out.println(result);
  }

  public static int binaryReturnIndexIfIncluded(int[] arr, int searchVal) {
    int start = 0;
    int end = arr.length -1;
    int mid;

    while(start < end) {
      mid = (start + end)/2;

      if (arr[mid] == searchVal) {
        return mid;
      } 
      else if (searchVal > arr[mid]){
        start = mid + 1;
      }
      else {
        end = mid -1;
      }
    }
    return -1;

  }
}


//for sequential search
// int len = arr.length;
// for (int i = 0; i < len; i++) {
//   if (arr[i] == searchVal) {
//     return i;
//   }      
// }
// return -1;