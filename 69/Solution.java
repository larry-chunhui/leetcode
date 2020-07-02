class Solution {

public static void main(String[] args){
	int x=0;
	x=2147395600;
	System.out.println("x= "+x);
	int i=0; //why long?
        while(i*i<=x){
            i++;
        }        
        System.out.println((int)i-1);
        //return ;
}

}
