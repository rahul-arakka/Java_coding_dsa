package code.arrays;

public class SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int[] list = new int[nums.length + 1];
            // ArrayList<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list[num]++;
            }
            for (int i = 0; i < list.length; i++) {
                if (list[i] == 1) {
                    return list[i];
                }
            }
            // for(Map.Entry ent : map.entrySet()){
            //     if((int)ent.getValue() != 2)
            //         return (int)ent.getValue();
            // }
            return 0;
        }
    }
}
