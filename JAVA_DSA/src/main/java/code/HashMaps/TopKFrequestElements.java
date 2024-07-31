//https://30dayscoding.com/dsa
//https://leetcode.com/problems/top-k-frequent-elements/description/
//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

package code.HashMaps;

class TopKFrequestElements {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            int[] res = new int[k];
            int x = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int key : nums) {
                int count = map.containsKey(key) ? map.get(key) : 0;
                map.put(key, count + 1);

            }
            ArrayList<Integer> rmv = new ArrayList<>();
            // System.out.println("- Printing Map : " + map);
            for (int i = 0; i < k; i++) {
                int max = 0, ans = 0;
                for (Map.Entry val : map.entrySet()) {
                    if ((int) val.getValue() > max && !rmv.contains((int) val.getKey())) {
                        max = (int) val.getValue();
                        ans = (int) val.getKey();
                        rmv.add(ans);


                        // System.out.println(" Printing ans, max: " + ans + "," + max);
                    }
                }
                res[x] = ans;
                x++;
            }
            return res;
        }
    }
}