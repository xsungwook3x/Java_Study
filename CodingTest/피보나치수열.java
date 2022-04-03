package CodingTest;
import java.util.*;

public class 피보나치수열 {

    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0]=1;
        answer[1]=1;
        for(int i=2; i<n; i++){
            answer[i]=answer[i-1]+answer[i-2];
        }
        return answer;
    }
    public static void main(String[] args){
        피보나치수열 T = new 피보나치수열();
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = T.solution(n);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
