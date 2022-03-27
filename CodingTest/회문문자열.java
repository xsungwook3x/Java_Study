package CodingTest;
import java.util.*;

public class 회문문자열 {

    public String solution(String str){
        str=str.toLowerCase();
        int lx=0;
        int rx=str.length()-1;

        while(lx<rx){
            if(str.charAt(lx)!=str.charAt(rx)){
                return "NO";
            }
            rx--;
            lx++;
        }
        return "YES";
    }

    public static void main(String[] args){
        회문문자열 T = new 회문문자열();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
