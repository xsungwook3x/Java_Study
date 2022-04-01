package CodingTest;
import java.util.*;

public class 암호 {

    public String solution(int n, String str){
        String answer="";

        for(int i=0; i<n;i++){
            String tmp =str.substring(0,7);
            String num="";
            for(char x : tmp.toCharArray()){
                if(x=='#') num+=1;
                else if(x=='*') num+=0;
            }
            int ascNum=Integer.valueOf(num,2);
            char convertedChar=(char) ascNum;
            answer+=convertedChar;

            str=str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args){
        암호 T = new 암호();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n,str));
    }
}
