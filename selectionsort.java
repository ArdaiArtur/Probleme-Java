public class selectionsort {
   static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
  static void sort(int arr[])
  {
    for (int i = 0; i < arr.length; i++) {
        int midx=i;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[j]<arr[midx])
            midx=j;
        }
        QuickSort.swap(arr, midx, i);
    }

  }
    // Driver code to test above
    public static void main(String args[])
    {
        
        int arr[] = {64,25,12,22,11};
       sort(arr);
       QuickSort.printArray(arr, arr.length);
    }

}
