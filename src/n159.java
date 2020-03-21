import netscape.security.UserTarget;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class n159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int begin,end;
        int result=0;
        char[] chars=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(begin=0,end=0;end<chars.length;end++){
            map.put(chars[end],end);
            if(map.size()>2){
                int temp= Collections.min(map.values());
                map.remove(chars[temp]);
                begin=temp+1;
            }
            result=Math.max(result,end- begin+1);
        }

        return  result;

    }

    public static void main(String[] args) {
        n159 test=new n159();
        int result=test.lengthOfLongestSubstringTwoDistinct("ccaabbb");
        System.out.printf("result="+result);
    }
}
