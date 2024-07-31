//https://30dayscoding.com/dsa
//https://leetcode.com/problems/group-anagrams/description/
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

class GroupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> map = new HashMap<>();

            for (String key : strs) {
                char[] ch = key.toCharArray();
                Arrays.sort(ch);
                String sortedWord = new String(ch);

                if (!map.containsKey(sortedWord)) {
                    map.put(sortedWord, new ArrayList<String>());
                }
                map.get(sortedWord).add(key);

            }
            return new ArrayList<>(map.values());

        }
    }
}