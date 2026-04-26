import java.util.*;
class Solution {
    public int[] union(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        // Merge both arrays
        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                if(list.size() == 0 || list.get(list.size() - 1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if(list.size() == 0 || list.get(list.size() - 1) != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        // Remaining elements of arr1
        while(i < n){
            if(list.size() == 0 || list.get(list.size() - 1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        // Remaining elements of arr2
        while(j < m){
            if(list.size() == 0 || list.get(list.size() - 1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        // Convert list to array
        int[] result = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            result[k] = list.get(k);
        }
        return result;
    }
}
