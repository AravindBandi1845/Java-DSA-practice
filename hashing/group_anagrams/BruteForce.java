class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>();
    boolean[] visited = new boolean[strs.length];

    for (int i = 0; i < strs.length; i++) {
        if (visited[i]) continue;

        List<String> currentGroup = new ArrayList<>();
        currentGroup.add(strs[i]);
        visited[i] = true;

        int[] freqI = getFrequency(strs[i]);

        for (int j = i + 1; j < strs.length; j++) {
            if (!visited[j]) {
                int[] freqJ = getFrequency(strs[j]);
                if (Arrays.equals(freqI, freqJ)) {
                    currentGroup.add(strs[j]);
                    visited[j] = true;
                }
            }
        }
        result.add(currentGroup);
    }
    return result;
}
private int[] getFrequency(String s) {
    int[] count = new int[26];
    for (char c : s.toCharArray()) {
        count[c - 'a']++;
    }
    return count;
}
}
