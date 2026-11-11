package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Day2 {
    //49.字母异位词
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(s);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
