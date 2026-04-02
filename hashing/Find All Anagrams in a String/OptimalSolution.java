class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int m=s.length();
        int n=p.length();
        if(m<n) return list;
        int[] pcount=new int[26];
        int[] wcount=new int[26];
        for(char c:p.toCharArray()){
            pcount[c-'a']++;
        }
        for(int i=0;i<m;i++){
            wcount[s.charAt(i)-'a']++;
            if(i>=n){
                char leftchar=s.charAt(i-n);
                wcount[leftchar-'a']--;
            } 
            if(i>=n-1){       
                if(Arrays.equals(pcount,wcount)){
                    list.add(i-n+1);
                }
            }
        }
        return list;
    }
}
