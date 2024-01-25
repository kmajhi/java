class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int temp = x;
        boolean ans = false;

        if (x < 0) return false;
        if(x==0) return true;
        while(temp!=0){
            int r = temp%10;
            sum = sum*10+r;
            temp=temp/10;
            if(x == sum){
                ans =  true;
            }
        }
        return ans;
    }
}
