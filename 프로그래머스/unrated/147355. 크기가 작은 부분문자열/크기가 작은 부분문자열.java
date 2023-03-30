import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int tNum = 0, pNum = 0;

        int count = 0;

        // 각 문자열의 길이
        tNum = t.length();
        pNum = p.length();
        

        for(int i = 0; i <= tNum - pNum; i++) {
            // 부분 문자열이 p보다 작거나 같으면 count 증가
            if(Long.parseLong(t.substring(i, i+pNum)) <= Long.parseLong(p)) {
                count++;
            }
        }
        return count;
    }

    
}