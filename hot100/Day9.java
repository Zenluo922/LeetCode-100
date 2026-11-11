package hot100;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day9 {
    public List<Integer> findAnagrams(String s, String p) {
        //第一个 for 循环：
        //
        //遍历 pLen 次，统计 p 中所有字母的次数，
        //同时统计 s 前 pLen 个字符（第一个固定窗口）中所有字母的次数。
        //
        //如果 sCount 和 pCount 的 26 个位置都相同，
        //说明 s 的第一个窗口和 p 是异位词，
        //将起始下标 0 放入 ans。
        //第二个 for 循环：
        //
        //每次让长度为 pLen 的窗口向右移动一格。
        //
        //左侧出去的字符：在 sCount 中减一；
        //右侧新进入的字符：在 sCount 中加一。
        //
        //更新后比较 sCount 和 pCount：
        //如果各个字母出现次数都相同，
        //说明当前窗口是异位词，
        //其起始下标就是 i + 1。
        int slen = s.length();
        int plen = p.length();
        if(plen>slen){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> index = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < plen; i++) {
            ++sCount[s.charAt(i)-'a'];
            ++pCount[p.charAt(i)-'a'];
        }
        if (Arrays.equals(sCount,pCount)){
            index.add(0);
        }
        for (int i = 0;i<slen-plen;i++){
            --sCount[s.charAt(i)-'a'];
            ++sCount[s.charAt(i+plen)-'a'];
            if (Arrays.equals(sCount,pCount)){
                index.add(i+1);
            }
        }
        return index;
    }
}
