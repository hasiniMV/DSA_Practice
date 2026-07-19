class Solution {
    public int maximum69Number (int num) {
        
        int len = String.valueOf(num).length();
        
        int[] ar = new int[len];
        int[] largest = new int[len];
        int k = 0;
        
        for(int i = len - 1 ; i >= 0 ; i--){
            k = num % 10;
            ar[i] = k;
            num = num / 10;
        }
        
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            for(int g = 0 ; g < len ; g++){
                arr[g] = ar[g];
            }
            
            
            if(arr[i] == 6 ){
               arr[i] = 9;
            }

            int l = arr[0];
            for(int j = 0 ; j < len - 1 ; j++){
                l = l * 10 + arr[j+1];
            }
            
            largest[i] = l;
        }
        
        int temp = largest[0];
        for(int m = 0 ; m < len ; m++){
            if (largest[m] > temp){
                temp = largest[m];
            }
        }
        return temp;
    }
}