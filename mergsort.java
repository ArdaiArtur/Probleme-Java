import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class mergsort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        QuickSort.printArray(arr, arr.length);
        sort(arr, 0, arr.length-1);
        QuickSort.printArray(arr, arr.length);

    }
    static void merge(int a[],int l,int r,int m)
    {
        int n1=m-l+1;
        int n2=r-m;
        int []L=new int [n1];
        int []R=new int [n2];
        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];
        int i=0,j=0;
        int k=l;
        while(i<n1&&j<n2)
        {
            if(L[i]<=R[j])
            {
                a[k]=L[i];
                i++;
            }
            else
            {
                a[k]=R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }

    }
       static void sort(int arr[],int l,int r)
        {
            if(l<r)
            {
                int m=l+(r-l)/2;
                sort(arr, l, m);
                sort(arr, m+1, r);
                merge(arr, l, r, m);
            }
        }
}
