package leetCode.groupAnagrams;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();
        for (String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            List<String> list = result.getOrDefault(s, new ArrayList<>());
            list.add(str);
            result.put(s,list);
        }
        return new ArrayList<>(result.values());
    }
}
