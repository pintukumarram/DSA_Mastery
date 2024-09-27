public class SecondLargestElement {
  public static void main(String[] args) {
    int arr[] = { 10, 3, 5, 12, 2, 6, 7 };
    int largest = Integer.MIN_VALUE;
    int SecondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        SecondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > SecondLargest && arr[i] != largest) {
        SecondLargest = arr[i];
      }
    }
    if (SecondLargest == Integer.MIN_VALUE) {
      System.out.println("There is No second largest elements");
    } else {
      System.out.println("Largest element: " + largest);
      System.out.println("Second Largest element: " + SecondLargest);
    }
  }
}
