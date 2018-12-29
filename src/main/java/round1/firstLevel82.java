package round1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:28 2018/7/5
 * @Modified By:
 */
public class firstLevel82 {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq =  new PriorityQueue<>(
            (o1, o2) -> o2.getValue() - o1.getValue());
        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> entry = pq.poll();
            for(int i = 0; i < entry.getValue(); ++i){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("treeE"));
    }
}
