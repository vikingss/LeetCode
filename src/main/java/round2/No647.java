package round2;


public class No647 {
    int res = 0;
    public int countSubstrings(String s) {
        if(s == null || s.length() == 0) return 0;
        for(int i = 0; i < s.length(); ++i){
            expend(s,i,i);
            expend(s,i,i+1);
        }
        return res;
    }

    private void expend(String s, int i, int j) {
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            res++;
            i--;
            j++;
        }
    }
}
