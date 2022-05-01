package Doit;

import java.util.*;

public class 좋은수구하기 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=1;i<n;i++){
            int l=0;
            int r=i-1;
            while(l<r){
                if(arr[l]+arr[r]==arr[i]){
                    count++;
                    break;
                }
                l++;
                r--;
            }
        }

        System.out.println(count);
    }
}
