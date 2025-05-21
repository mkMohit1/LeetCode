class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int i=0, temp =x,sum=0;
        while(temp>0){
            int temp2 = temp%10;
            if(sum>0){
                sum = sum*10;
            }
            sum +=temp2;
            temp = temp/10;
        }
        if(sum == x) return true;
        return false;
    }
}