package practice;

public class TrimTrailingPattern {
    public static void main(String[] args) {
        String s = "aeiou";

        int ptr = s.length() - 1;
        for(int i = ptr;i>=0;i--){
            if(s.charAt(ptr)=='a' || s.charAt(ptr)=='e' || s.charAt(ptr)=='i' || s.charAt(ptr)=='o' || s.charAt(ptr)=='u'){
                ptr--;
            }else{
                break;
            }
        }
        System.out.println(s.substring(0,ptr+1));
    }
    }

