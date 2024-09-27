public class Reverse {

  public static void main(String[] args) {
    int arr[]={11,10,9,8,7,6,5,4,3,2,1};
    int temp;
    for(int i=0;i<arr.length-i-1;i++){
      temp=arr[i];
      arr[i]=arr[arr.length-i-1];
      arr[arr.length-i-1]=temp;
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}