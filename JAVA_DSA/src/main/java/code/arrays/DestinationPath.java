//https://leetcode.com/problems/destination-city/description/
//You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
//It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

package code.arrays;

import java.util.ArrayList;
import java.util.List;

public class DestinationPath {
    class Solution {
        public String destCity(List<List<String>> paths) {
            List<String> res = new ArrayList<>();
            for (List val : paths) {
                res.add((String) val.get(0));
            }
            for (List val : paths) {
                if (!res.contains((String) val.get(1))) {
                    return (String) val.get(1);
                }
            }
            return "";
        }
    }
}
