class Solution {
    static Long squaresInChessBoard(Long N) {
        // code here
        long s=0;
        while(N>0){
            long mul=N*N;
            // System.out.println(mul);
            s+=mul;
            N--;
        }
        return s;
    }
};