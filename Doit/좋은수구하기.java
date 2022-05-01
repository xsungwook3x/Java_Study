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
        Arrays.sort(arr); // 먼저 배열 정렬
        int count=0;
        for(int i=1;i<n;i++){ //순서대로 탐색시작
            int l=0;  //두개의 포인터로 좌우에서 하나씩 탐색해나간다. 정렬되어있기때문에 l은 늘 0에서 시작
            int r=i-1;  //r은 현재 탐색기준의 바로 왼쪽을 할당해준다.
            while(l<r){ //가운데에서만나거나 엇갈려서 지나가게되어 l>=r일경우에 쫑내준다.
                if(arr[l]+arr[r]==arr[i]){//현재 위치에서 비교 값이 같으면 count에 1추가해주고 해당 와일문을 바로 쫑내준다.
                    count++;
                    break;
                }
                else if(arr[l]+arr[r]<arr[i]){//못구하면 하나씩이동한다.
                    //정렬되어있기때문에 크기가 작을경우엔 왼쪽포인터를 조정해주고
                    l++;
                }
                else{//크기가 크면 오른쪽 포인터를 조정해준다.
                    r--;
                }

            }
        }

        System.out.println(count);
    }
}
