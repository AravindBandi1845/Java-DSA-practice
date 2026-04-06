class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> a.getValue().compareTo(b.getValue()));
        int[] result = new int[k];
        int j = 0;
        for (int i = list.size() - 1; i >= list.size() - k; i--) {
            result[j++] = list.get(i).getKey();
        }

        return result;
    }
}
