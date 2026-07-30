class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n ; 
        int sum = 0 ;
        int prod = 1; 
        int k =0;
        while(n>0){
            k=n%10;
            sum = sum + k;
            n=n/10;
        }
        while(temp >0){
            k=temp%10;
            prod = prod * k;
            temp=temp/10;
        } 
        return prod - sum;
    }
}