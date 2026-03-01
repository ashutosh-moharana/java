package a2z;

public class MissingNo {
    public static void main(String[] args) {
        int[] nums = {0,1,3,4,5};
        int sum = 0;
        int len = nums.length;
        int origArrSum = (len*(len+1))/2;


        for(int elem: nums){
            sum += elem;
        }

         System.out.println(origArrSum - sum);
    }
}
