class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ex) {
        Boolean[] res = new Boolean[c.length]; 
        int max = c[0]; 
        for(int num:c){
            if(num>max) max = num; 
        }
        for(int i=0;i<c.length;i++ ){
            if(c[i]+ex >= max) 
                res[i] = true;
            else 
                res[i] = false;
        }
        return Arrays.asList(res);

    }
}