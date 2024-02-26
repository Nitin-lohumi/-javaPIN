import java.util.Scanner;

public class pin {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the first three digit number ");
        int num1=s1.nextInt();
        System.out.println("enter the second three digit number ");
        int num2=s1.nextInt();
        System.out.println("enter the third three digit number ");
        int num3=s1.nextInt();
        int a=num1,b=num2,c=num3;
        int pin =0;
        for(int i=0; i<3; i++){
            pin =pin*10 + minDigits(num1, num2, num3);
            num1=num1/10;
            num2= num2/10;
            num3 = num3/10;
        }
        int rem=0,p=0;
        while(pin>0){
            rem=pin%10;
			p=p*10+rem;
			pin=pin/10;
        }
        int max=0;
		for(int i=0;i<3;i++)
		{
		 if(max<maxDigit(a,b,c))
			max=maxDigit(a,b,c);
			a=a/10;
			b=b/10;
			c=c/10;
		}
        max=max*1000;
        if(p<100){
        p=p*10;
		p=max+p;
        }
        else{
            p=p+max;
        }
      System.out.println("your PIN id =>  "+p);
    }
    static int minDigits(int num1,int num2,int num3){
   int min=((num1%10)<(num2%10))?((num1%10<num3%10)?(num1%10):(num3%10)):((num2%10)<(num3%10)?num2%10:num3%10);
     return min;
    }
    static int maxDigit(int num1,int num2,int num3)
	{
        int max= ((num1%10)>(num2%10)) ? 
         ((num1%10>num3%10)?(num1%10):(num3%10)) : ((num2%10)>(num3%10)?num2%10:num3%10);
        return max;
       }
}
