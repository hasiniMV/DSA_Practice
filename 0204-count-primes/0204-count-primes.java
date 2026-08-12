class Solution {
    public int countPrimes(int n) {
        int count = 0 ;
        
        boolean[] arr = new boolean[n+1];
        for(int i = 2 ; i < n ; i++){
            arr[i] = true ;
        }
        for(int p = 2 ; p *p < n ; p++){
            if(arr[p] == true){
                for(int i = p*p ; i < n ; i+=p ){
                    arr[i]= false;
                }

            }
        }
        for(int i = 2 ; i <=n ; i++){
            if(arr[i] == true ){
               count+=1;
            }
        }
        return count;
    }
}