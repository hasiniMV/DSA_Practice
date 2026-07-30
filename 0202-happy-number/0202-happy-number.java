class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 1 && temp != 4) {
            sum = 0;

            while (temp > 0) {
                int k = temp % 10;
                sum = sum + (k * k);
                temp = temp / 10;
            }

            temp = sum;
        }
        if (temp == 1) {
            return true;
        } else {
            return false;
        }
    }
}











/*class Solution {
    public boolean isHappy(int n) {
        boolean b ;
        int temp= n ; 
int n = 0 ;
        int sum = 0 ;
        while(n>1){
            sum = 0 ;
            while(temp>0){
            k=temp % 10;
            sum = sum+(k*k);
            temp = temp/10;
            if(sum == 1){
                break;

            }
            else{
                temp =/
            }
            }
        }
        if (b==1){
            return true;
        }else{
        return false;}
        
    }
}*/