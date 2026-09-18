class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1 ; 
        }
        int a0 = 0 , a1= 1 , curr_fib = 0 ; 
        
            for(int i = 2 ; i<= n ; i++ ){
                curr_fib = a0 + a1 ; 
                a0 = a1 ; 
                a1 = curr_fib ;
            }
            return curr_fib ;
        }
}

