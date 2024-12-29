import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s = sc.nextInt();
        int len = s.length();
        int res = 0;

      // Breaking the string into two halves and comparing the first half with the reversed second half
        // so that we only have to check half the string and exit the loop if we find mismatch
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len-i-1)){
                res = 1;
                break;
            }
        }
        
        if(res == 0){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
