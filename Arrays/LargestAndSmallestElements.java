public class LargestAndSmallestElements {
  public static void main(String args[]) {
    int arr[] = { 20, 12, 3, 5, 9, 4, 14, 18 };
    int largest = arr[0];
    int smallest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }
    System.out.println(
        "Largest element: " + largest +"\t" + "Smallest element " + smallest);
  }
}