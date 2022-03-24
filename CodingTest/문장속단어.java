package CodingTest;
import java.util.*;
public class 문장속단어 {

    public String solution(String str){
        String answer="";
        String[] str2=str.split("\\s");
        for(int i=0; i < str2.length;i++){
            //System.out.println(str2[i]);
            if(str2[i].length()>answer.length()){
                answer=str2[i];
            }
        }
        return answer;
    }

    public static void main(String[] args){
        문장속단어 T = new 문장속단어();
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(T.solution(str));
    }
}
