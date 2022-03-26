package CodingTest;
import java.util.*;

public class 단어뒤집기 {
    public ArrayList<String> solution(int n,String[] str){
        ArrayList<String> answer=new ArrayList<>();
        for(String x : str){
            String tmp=new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args){
        단어뒤집기 T = new 단어뒤집기();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String[] str= new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
