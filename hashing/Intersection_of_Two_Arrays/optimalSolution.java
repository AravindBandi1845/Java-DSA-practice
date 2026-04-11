class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> intersect=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int n:nums2){
            if(set.contains(n)){
                intersect.add(n);
            }
        }
        int[] result=new int[intersect.size()];
        int index = 0;
        for (int val : intersect) {
            result[index++] = val;
        }
        return result;
    }
}
