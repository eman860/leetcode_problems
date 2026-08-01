class Solution {
    public int subtractProductAndSum(int n) {
        int res =0 , sum =0 ,pro=1;

        while(n!=0){
            int digit = n%10;
            sum += digit;
            pro *= digit;
            n /=10;
        }
        return res = pro - sum;
    }
}