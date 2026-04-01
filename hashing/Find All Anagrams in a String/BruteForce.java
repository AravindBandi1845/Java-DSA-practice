class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int m=s.length();
        int n=p.length();
        if(m<n) return list;
        int[] pcount=new int[26];
        for(char c:p.toCharArray()){
            pcount[c-'a']++;
            
        }
        for(int i=0;i<=m-n;i++){
            int[] wcount=new int[26];
            for(int j=0;j<n;j++){
                wcount[s.charAt(i+j)-'a']++;
            }
            if(Arrays.equals(pcount,wcount)){
                list.add(i);
            }
        }
        return list;
    }
}
