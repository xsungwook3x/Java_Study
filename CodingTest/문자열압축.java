package CodingTest;
import java.util.*;

public class 문자열압축 {

    public String solution(String str){
        String answer="";
        char c=' ';
        int count=1;
        for(char x : str.toCharArray()){
            if(x != c){
                if(count>1) answer+=count;
                c=x;
                answer+=x;
                count=1;
            }
            else{
                count++;
            }

        }
        if(count>1) answer+=count;

        return answer;
    }

    public static void main(String[] args){
        문자열압축 T = new 문자열압축();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
