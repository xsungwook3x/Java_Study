package CodingTest;
import java.util.*;

public class 중복문자제거 {
    public String solution(String str){
        char[] charArr=str.toCharArray();
        ArrayList<Character> charArr2 = new ArrayList<>();
        for(char x : charArr){
            if(!charArr2.contains(x)){
                charArr2.add(x);
            }
        }
        String answer="";
        for(char x : charArr2){
            answer+=x;
        }
        return answer;
    }

    public static void main(String[] args){
        중복문자제거 T = new 중복문자제거();
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
