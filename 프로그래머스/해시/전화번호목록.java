package 프로그래머스.해시;

public class 전화번호목록 {
    class Solution {
        public boolean solution(String[] phoneBook) {
            for(int i=0; i<phoneBook.length-1; i++) {
                for(int j=i+1; j<phoneBook.length; j++) {
                    if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                    if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
                }
            }
            return true;
        }
    }
}
