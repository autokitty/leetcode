import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class n340 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        int begin,end;
        int result=0;
        char[] chars=s.toCharArray();
        for(begin=0,end=0;end<chars.length;end++){
            map.put(chars[end],end);
            if(map.size()>k){
                int temp= Collections.min(map.values());
                map.remove(s.charAt(temp));
                begin=temp+1;
            }

            result=Math.max(result,end-begin+1);
        }
        return result;


    }

    public static void main(String[] args) {
        n340 test=new n340();
        int result=test.lengthOfLongestSubstringKDistinct("aa",1);
        System.out.printf("result="+result);
    }

}
