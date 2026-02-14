package basicMath;

import java.util.Scanner;

public class HCF {

    public static int hcf(int a, int b){
        int hcf=1;

        //brute-force
        for(int i=1;i<a&& i<b;i++){
            if(a%i==0&& b%i==0){
                hcf=i;
            }
        }

        return hcf;
    }


    public  static int euclid_hcf(int a, int b){
        if(b>a){
            int temp = a;
            a =b;
            b = temp;
        }
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
//        int hcf = HCF.hcf(sc.nextInt(),sc.nextInt()); //for brute force
        int hcf = HCF.euclid_hcf(sc.nextInt(),sc.nextInt());
        System.out.println(hcf);
    }
}
