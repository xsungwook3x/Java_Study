package CodingTest;

import com.sun.tools.javac.Main;

import java.util.*;

public class 문자찾기 {
    public int solution(String str, char t){
        int answer=0;
        String strLow = str.toLowerCase();
        char t2=Character.toLowerCase(t);
        for( int i=0; i<strLow.length();i++){
            if(strLow.charAt(i)==t2){
                answer+=1;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        문자찾기 T = new 문자찾기();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
