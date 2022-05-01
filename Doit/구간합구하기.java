package Doit;
import java.util.*;

public class 구간합구하기 {


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int q= sc.nextInt();
        int[] arrN = new int[n+1];
        arrN[0]=0;
        for(int i=1;i<=n;i++){
            arrN[i]=sc.nextInt();
            arrN[i]+=arrN[i-1];
            System.out.println(arrN[i]);
        }

        for(int i=0;i<q;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            System.out.println(arrN[b]-arrN[a-1]);
        }
    }
}
