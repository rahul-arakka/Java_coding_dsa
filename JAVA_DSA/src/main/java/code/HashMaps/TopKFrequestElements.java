//https://30dayscoding.com/dsa
//https://leetcode.com/problems/top-k-frequent-elements/description/
//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

package code.HashMaps;

class TopKFrequestElements {
    int[] res = new int[k];
    Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    }
    List<Integer> list[] = new ArrayList[nums.length+1];
        for(Map.Entry ent : map.entrySet()){
        if(list[(int)(ent.getValue())] == null){
            list[(Integer)(ent.getValue())] = new ArrayList<>();
        }
        list[(Integer)(ent.getValue())].add((Integer)(ent.getKey()));

    }
    int x = 0;
        for(int j=nums.length;j>=0;j--){
        if(list[j] != null){
            for(int val : list[j]){
                res[x++] = val;
            }
            if(x == k)   return res;
        }

    }
    // System.out.println("- Printing arraylist : " + list);
        return res;
}