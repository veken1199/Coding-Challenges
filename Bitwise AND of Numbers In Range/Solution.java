class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int count = 0;
        while(n > m){
            m = m/2;
            n = n/2;
            count++;
        }  
        return n<<count;
    }
}