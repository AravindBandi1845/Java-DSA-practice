import java.util.*;

class Solution {
    public int[] union(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;

        for(int num : set){
            result[i++] = num;
        }

        Arrays.sort(result);

        return result;
    }
}
