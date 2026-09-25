class Solution {
    public int addDigits(int num) {
        int digit;
        int count = 0;
        int sum=0;
        while(num>=10 ){
            sum = 0 ; 
        while(num>0){
           digit = num % 10 ; 
            sum = sum+digit ; 
           num = num / 10 ; 
        }
        num = sum ; 
        }
        if(num<10){
            return num ; 
        }
        return sum  ;
}
}