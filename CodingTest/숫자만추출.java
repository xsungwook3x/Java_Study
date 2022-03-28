package CodingTest;
import java.util.*;

public class 숫자만추출 {

    public int solution(String str){
        str=str.replaceAll("[^0-9]","");
        return Integer.parseInt(str);
    }

    public static void main(String[] args){
        숫자만추출 T = new 숫자만추출();
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
