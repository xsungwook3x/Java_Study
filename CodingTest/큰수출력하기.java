package CodingTest;
import java.util.*;

public class 큰수출력하기 {

    public void solution(int[] numArr){
        for(int i= 0; i < numArr.length; i++){
            if(i==0) {
                System.out.print(numArr[i] + " ");
                continue;
            }
            if(numArr[i]>numArr[i-1]) System.out.print(numArr[i]+" ");
        }
    }
    public static void main(String[] args){
        큰수출력하기 T = new 큰수출력하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        for(int i=0; i<n;i++){
            int x = sc.nextInt();
            numArr[i]=x;
        }
        T.solution(numArr);
    }
}
