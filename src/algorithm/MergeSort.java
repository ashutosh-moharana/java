package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[]  arr= {8,9,3,5,7,8,1,3,6};
        mergeSort(arr,0,arr.length-1);
        for(int num: arr){
            System.out.println(num);
        }

    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low<high){
            int mid = low + (high - low)/2;
            mergeSort(arr,low, mid);
            mergeSort(arr,mid+1,high);
            mergeElem(arr,low,mid,high);
        }

    }

    private static void mergeElem(int[] arr, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
         while(left<=mid && right<=high) {
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
         while(left<=mid){
             list.add(arr[left]);
             left++;
         }
         while(right<=high){
             list.add(arr[right]);
             right++;
         }

         //The main merging part
        for(int i= low; i<=high;i++){
            arr[i]= list.get(i - low);
        }
    }
}
