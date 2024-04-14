class Solution {
    public int hammingWeight(int n) {

        int sum = 0;
        for(int i = 0; i < 32; i++){
            sum += n % 2;
            n >>=1;
        }
        return sum;
    }
}