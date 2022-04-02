package CodingTest;
import java.util.*;

public class 가위바위보 {

    public ArrayList<String> solution(int[] arrA, int[] arrB){
        ArrayList<String> answer = new ArrayList<>();

        for(int i=0; i< arrA.length ; i++){
            if(arrA[i]==arrB[i]){
                answer.add("D");
            }
            else if((arrA[i]==1 && arrB[i]==3) ||(arrA[i]==2 && arrB[i]==1)||(arrA[i]==3 && arrB[i]==2)){
                answer.add("A");
            }
            else{
                answer.add("B");
            }
        }

        return answer;
    }

    public static void main(String[] args){
        가위바위보 T = new 가위바위보();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA=new int[n];
        int[] arrB = new int[n];
        for(int i =0 ;i<n;i++){
            arrA[i]=sc.nextInt();
        }
        for(int i =0 ;i<n;i++){
            arrB[i]=sc.nextInt();
        }

        for(String x : T.solution(arrA,arrB)){
            System.out.println(x);
        }
    }
}
