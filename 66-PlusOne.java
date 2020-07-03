class Solution {
    public int[] plusOne(int[] digits) {
       // System.out.println(digits.length);
        int x=digits[digits.length-1]+1;
        int last=x%10;
         x=x/10;
        
        digits[digits.length-1]=last;
        int i=digits.length-2;
        while(x!=0&&i>=0){
            x=digits[i]+x;
            last=x%10;
            x=x/10;
            
            digits[i]=last;
            i--;
            
            
            
        }
        if(digits[0]!=0){
            return digits;
        }
        else{
            int[] temp =new int[digits.length+1];
            temp[0]=1;
            return temp;
        }
        
        
    }
}