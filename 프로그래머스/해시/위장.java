package 프로그래머스.해시;
import java.util.*;
public class 위장 {

    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;

            Map<String,Integer> map=new HashMap();

            for(String[] clothe : clothes){
                if(!map.containsKey(clothe[1])){
                    map.put(clothe[1],1);
                }else{
                    int tmp = map.get(clothe[1]);
                    map.put(clothe[1],tmp+1);
                }
            };

            Iterator<Integer> it = map.values().iterator();
            while(it.hasNext()) {
                answer *= it.next().intValue()+1;
            }

            return answer-1;
        }
    }
}
