import java.util.HashSet;

public class DuplicateRemove {
  // Remove dubplicates form sorted array
  public static void main(String[] args) {
    int arr[] = { 1, 1, 2, 4, 4, 5 };
    if (arr.length == 0)
      return;
    int j = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[j]) {
        j++;
        arr[j] = arr[i];
      }
    }
    for (int i = 0; i <= j; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println("\t");
    // Remove duplicates from unsorted array
    int arr2[] = { 1, 1, 3, 3, 2, 2, 5, 4, 3, 1, 4, 6, 9, 6,7,8,7 ,4 };

    HashSet<Integer> uniqueElement = new HashSet<>();

    int result[] = new int[arr2.length];
    int k = 0;

    for (int i = 0; i < arr2.length; i++) {
      if (!uniqueElement.contains(arr2[i])) {
        uniqueElement.add(arr2[i]);
        result[k] = arr2[i];
        k++;
      }
    }
    for (int i = 0; i < k; i++) {
      System.out.print(result[i] + " ");
    }
  }
}