class Digits{
    public static void main(String args[]){
        int d1,d2,d3,d4;
	int a=1234;
	d1=a%10;
	d2=(a/10)%10;
	d3=(a/10)%10;
	d4=a/10;
	int sum=d1+d2+d3+d4;
	System.out.println("Sum of the digit is: " +sum);
    }
}