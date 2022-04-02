package CodingTest;
import java.util.*;

public class 보이는학생 {

    public int solution(int[] arr){
       int answer=0;
       int h =-1;
       for(int i=0; i<arr.length;i++){
           if(h<arr[i]){
               answer+=1;
               h=arr[i];
           }
       }
       return answer;
    }

    public static void main(String[] args){
        보이는학생 T = new 보이는학생();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
