//https://30dayscoding.com/dsa
//https://leetcode.com/problems/group-anagrams/description/
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

class GroupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            List<List<String>> result = new ArrayList<>();

            ArrayList<String> list = new ArrayList<String>(Arrays.asList(strs));
            if (strs.length == 1) {
                result.add(Arrays.asList(list.get(0)));
                return result;
            }
            int i = 0;
            ArrayList<HashMap<Character, Integer>> tempList = new ArrayList<>();
            while (i < list.size()) {
                boolean flag = true;
                String key = list.get(i);
                List<String> mapValues = new ArrayList<>();
                mapValues.add(key);
                // System.out.println("--- printing mapValue : " + mapValues + " i:" + i);
                HashMap<Character, Integer> map1 = new HashMap<>();
                char[] ch = key.toCharArray();
                for (char val : ch) {
                    int count = map1.containsKey(val) ? map1.get(val) : 0;
                    map1.put(val, count + 1);
                }
                // System.out.println("------ Printing key : "+ key);
                // System.out.println(tempList.contains(map1));
                if (tempList.contains(map1)) {
                    i++;
                    // System.out.println("--- printing inside i:" + i);
                    flag = false;
                }
                tempList.add(map1);
                // list.remove(0);
                int j = i + 1;
                while (flag && j < list.size()) {
                    String key2 = list.get(j);
                    HashMap<Character, Integer> map2 = new HashMap<>();
                    char[] ch2 = key2.toCharArray();
                    for (char val2 : ch2) {
                        int count2 = map2.containsKey(val2) ? map2.get(val2) : 0;
                        map2.put(val2, count2 + 1);
                    }

                    // System.out.println("------ Printing map1 : "+ map1);
                    // System.out.println("------ Printing map2 : "+ map2);
                    if (map1.equals(map2)) {
                        mapValues.add(key2);
                        // list.remove(key2);
                        // System.out.println("--- printing remove i:" + i);
                    }
                    j++;
                }
                if (flag)
                    i++;
                if (flag)
                    // System.out.println("------ Printing mapValues : "+ mapValues);
                    result.add(mapValues);
                // System.out.println("------ Printing result : "+ result);
            }
            Collections.reverse(result);
            return result;
        }
    }
}