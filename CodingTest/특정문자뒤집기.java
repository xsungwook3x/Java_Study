package CodingTest;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class 특정문자뒤집기 {
    public String solution(String str){
        char[] ch = str.toCharArray();
        List<Character> chArr = new ArrayList<>();

        for(char c : ch){
            if('a'<=c && c<='z' || 'A'<=c&&c<='Z'){
                chArr.add(c);
            }
        }
        Collections.reverse(chArr);

        String answer = "";
        int i=0;
        for(char c : ch){
            if('a'<=c && c<='z' || 'A'<=c&&c<='Z'){
                answer+=chArr.get(i);
                i++;
            }
            else{
                answer+=c;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        특정문자뒤집기 T = new 특정문자뒤집기();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
