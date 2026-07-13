class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
    
        for (int i = n - 1; i >= 0; i--) {
           
            if (digits[i] < 9) {
                digits[i]++;
                return digits; 
            }
            digits[i] = 0;
        }
        
        int[] newarr = new int[n + 1];
        newarr[0] = 1; 
        
        return newarr;
    }
}

//Hasiniiiiiiii , biginteger use karna hai
//kani nek thelid gaaa
/*class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length ;
        int k = 1;
        int l = 0;
        int[] newarr = new int[n];
        for(int i = 0 ; i <n;i++){
            l = l * 10  + digits[i];
          
        }
        l = l+1;
        for(int i = n-1 ; i >= 0 ;i--){
            newarr[i] = l%10;
            l = l/10;
        }
        if (l > 0) {
            int[] edgeArray = new int[n + 1];
            edgeArray[0] = l;
            for (int i = 0; i < n; i++) {
                edgeArray[i + 1] = newarr[i];
            }
            return edgeArray;
        }
        return newarr;
    }
}*/