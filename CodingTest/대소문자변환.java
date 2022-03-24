package CodingTest;
import java.util.*;

public class 대소문자변환 {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer+=Character.toUpperCase(x);
            }
            else{
                answer+=Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String arg[]){
        대소문자변환 T = new 대소문자변환();
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        System.out.println(T.solution(str));
    }
}
