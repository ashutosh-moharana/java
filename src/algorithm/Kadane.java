package algorithm;

public class Kadane {
    public static void main(String[] args) {

        //print maximum of subarrays.
        int[] arr = {5,2,3,4,6};
//        int sum =0;
//        for(int i = 0;i<arr.length;i++){
//            int prevSum = 0;
//            for(int j = i; j<arr.length;j++){
//                prevSum += arr[j];
//                if(prevSum>sum){
//                    sum = prevSum;
//                }
//
//            }
//        }
        int currSum = arr[0];
        int maxSum = arr[0];
        for(int i = 1; i<arr.length;i++){

            currSum  = Math.max(arr[i],currSum+arr[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        System.out.println(maxSum);
    }

}
