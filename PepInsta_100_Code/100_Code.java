//First Code Even And Odd

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		if(var%2==0){
		    System.out.println("Even");
		}else{
		    System.out.println("Odd");
		}
	}
}

// 2nd Code Positive and Negative

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		if(var>=0){
		    System.out.println("+ve");
		}else{
		    System.out.println("-ve");
		}
	}
}

// 3rd Code Sum of First N Natural numbers:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		System.out.print((var*(var+1))/2);
	}
}

// 4th Code Sum of N natural numbers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		System.out.print((var*(var+1))/2);
	}
}

// 5th Code Greatest of two numbers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		if(var1>var2){
		    System.out.println(var1 + " is greater than " + var2);
		}else if(var1==var2){
         System.out.println(var1 + " is equal to " + var2);
     }
     else{
		    System.out.println(var2 + " is greater than " + var1);
		}
	}
}

// 6th Code Greatest of the Three numbers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		if(var>=0){
		    System.out.println("+ve");
		}else{
		    System.out.println("-ve");
		}
	}
}

// 7th Code Leap year or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		if(var%400==0 || var%100!=0 && var%4==0){
		    System.out.println(var +" is a leap Year");
		}else{
		    System.out.println(var + " is not a leap year");
		}
	}
}

//8th Code Prime numbers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		int val = 0;
		for(int i = 2;i<var;i++){
		    if(var%i==0){
		        System.out.print(var + " is not a Prime Number");
		        val++;
		        break;
    		 }
    	}
    	if(val==0){
    	    System.out.print(var + " is a Prime Number");
    	}
	}
}

// 9th Code Prime number within a given range

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		for(int j = var1;j<=var2;j++){
		    int val = 0;
		    for(int i = 2;i<j;i++){
    		    if(j%i==0){
    		        System.out.println(j + " is not a Prime Number");
    		        val++;
    		        break;
        		 }
        	}
        	if(val==0){
        	    System.out.println(j + " is a Prime Number");
        	}
		}
		
	}
}

// 10th Sum of digits of a number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		int res = 0;
		int n = (int)(Math.log10(var))+1;
		for(int i = 0;i<n;i++){
		    res+=var%10;
		    var=var/10;
		}
		System.out.print(res);
	}
}

// 11th Reverse a Number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		int res = 0;
		int ans = var%10;
		var = var/10;
		int n = (int)(Math.log10(var))+1;
		for(int i = 0;i<n;i++){
		    res = var % 10;
		    ans = ans*10;
		    ans += res;
		    var = var/10;
		}
		System.out.print(ans);
	}
}

// 12th Palindrome Number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var1 = sc.nextInt();
		int var = var1;
		int res = 0;
		int ans = var%10;
		var = var/10;
		int n = (int)(Math.log10(var))+1;
		for(int i = 0;i<n;i++){
		    res = var % 10;
		    ans = ans*10;
		    ans += res;
		    var = var/10;
		}
		if(ans==var1){
		    System.out.print("Palindrome Number");
		}else{
		    System.out.print("Not Palindrome Number");
		}
		
	}
}

// 13th Armstrong Number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		int var1 = var;
		int n = (int)(Math.log10(var))+1;
		int res = 0;
		for(int i = 0;i<n;i++){
		    int v = var%10;
		    res += Math.pow(v,n);
		    var = var/10;
		}
		if(res == var1){
		    System.out.print("Armstrong Number");
		}else{
		    System.out.print("Not Armstrong Number");
		}
		
	}
}

// 14th Armstrong number in a given range

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		for(int j = var1;j<var2;j++){
		    int res = 0;
		    int val = j;
		    int n = (int)(Math.log10(j))+1;
    		for(int i = 0;i<n;i++){
    		    int v = val%10;
    		    res += Math.pow(v,n);
    		    val = val/10;
    		}
    		if(res == j){
    		    System.out.println(res+ " Armstrong Number");
    		}
		}
		
	}
}

// 15th Fibonacci Series upto nth term

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pre = 1;
		int cur = 1;
		int ans = 1;
		for(int k = 3; k<=n;k++){
		    ans = pre + cur;
		    pre = cur;
		    cur = ans;
		}if(n==0){
		    System.out.println(n+" Fibonacci number is 0");
		}else if(n==1 && n ==2){
		    System.out.println(n+" Fibonacci number is 1");
		}else if(n>2){
		    System.out.println(n+" Fibonacci number is "+ ans);
		}else{
		    System.out.println("Please Enter the valid number");
		}
		
	}
}

// 16th Find the Nth Term of the Fibonacci Series

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pre = 0;
		int cur = 1;
		int ans = 1;
		if(n>=0){
		    System.out.println(0+" Fibonacci number is 0");
		}
		if(n>=1){
		    System.out.println(1+" Fibonacci number is 1");
		}
		for(int k = 2; k<=n;k++){
		    ans = pre + cur;
		    pre = cur;
		    cur = ans;
		    System.out.println(k+" Fibonacci number is "+ ans);
		}
	}
}

// 17th Factorial of a number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 1;
		for(int i = 1;i<=n;i++){
		    res *=i;
		}
		System.out.print(res);
	}
}

// 18th Power of a number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int power = sc.nextInt();
		int res = 1;
		for(int i = 0;i<power;i++){
		    res *=n;
		}
		System.out.print(res);
	}
}

// 19th Factor of a number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 1;
		for(int i = 1;i<=n;i++){
		    if(n%i==0){
		        System.out.println(i);
		    }
		}
	}
}

// 20th Finding Prime Factors of a number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 2; i<= n; i++){
            if(isprime(i)==1){
                int x = n;
                while(x%i==0){
                    System.out.print(i + " ");
                    x /= i;
                }
            }
        }
	}
	public static int isprime(int n){
	    for(int i = 2; i<=Math.sqrt(n); i++){
	        if(n%i==0)
	            return 0;
	        
	    }
	    return 1;
    }
}

// 21th Strong number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
        int fact,lastdig;
        int total = 0;
        int temp = n;
        while(n != 0){
            i = 1;
            fact = 1;
            lastdig = n % 10;
            while(i <= lastdig){
                fact = fact * i;
                i++;
            }
            total = total + fact;
            n = n / 10;
        }
        if(total == temp)
            System.out.println(temp + " is a strong number\n");
        else
            System.out.println(temp + " is not a strong number\n");
	}
}

// 22th Perfect number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i, sum=0;
        for(i=1; i<num; i++){
            if(num%i==0)
                sum = sum+i;
        }
        if(sum==num)
            System.out.println("It is a Perfect Number.");
        else
            System.out.println("It is not a Perfect Number.");
	}
}

// 23th Perfect Square

import java.util.*;
public class Main
{
    static boolean isPerfectSquare(int x)
    {
        if (x >= 0) {
            int sr = (int)Math.sqrt(x);
            return ((sr * sr) == x);
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isPerfectSquare(n))
            System.out.print("Perfect Square");
        else
            System.out.print("Not a Perfect Square");
	}
}

// 24th Automorphic number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sq = n * n ;
        if(isAutomorphic(n) == 1)
            System.out.println("Num: "+ n + ", Square: " + sq + " - is Automorphic");
        else
            System.out.println("Num: "+ n + ", Square: " + sq + " - is not Automorphic");
	}
	
	static int isAutomorphic(int n){
        int square = n * n;
        while(n != 0)
        {
            // means not automorphic number
            if(n % 10 != square % 10){
                return 0;
            }
            // reduce down numbers
            n /= 10;
            square /= 10;
        }
        // if reaches here means automorphic number
        return 1;
	}
}

// 25th Harshad number 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		while(n != 0)
		{
			int pick_last = n % 10;
			result = result + pick_last;
			n = n / 10;
		}
        if(n % result == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
	}
}

// 26th Abundant number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

        for (int i = 1; i < n; i++) { 
            if (n % i == 0) 
                sum = sum + i; 
        } 
        if (sum > n){
         	System.out.println (n + " is an Abundant Number");
         	System.out.println ("The Abundance is: " + (sum - n));
        }
        else
            System.out.println (n + " is not an Abundant Number");
	}
}

// 27th Friendly pair

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum1 = getDivisorsSum (num1);
        int sum2 = getDivisorsSum (num2);
        if (sum1 / num1 == sum2 / num2)
            System.out.println (num1 + " & " + num2 + " are friendly pairs");
        else
            System.out.println (num1 + " & " + num2 + " are not friendly pairs");
    }

    static int getDivisorsSum (int num){
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0) sum = sum + i;
        }
        return sum;
    }
}

// 28th Sum of the number in the given range

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = 0;
		for(int i = num1 ; i<=num2;i++){
		    res += i;
		}
		System.out.print(res);
	}
}

// 29th Highest Common Factors(HCF)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int hcf = 0;
		for(int i = 1;i<=num1 || i<= num2;i++){
		    if(num1%i == 0 && num2%i == 0){
		        hcf = i;
		    }
		}
		System.out.println(hcf);
		
	}
}


// 30th Lowest Common Multiple (LCM)

// Method 1

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int lcm = 0;
		int max = Math.max(num1,num2);
		for(int i = max;i<=num1*num2;i++){
		    if(i%num1 == 0 && i%num2 == 0){
		        lcm = i;
		        break;
		    }
		}
		System.out.println(lcm);
		
	}
}

// Method 2

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int hcf = 0;
		for(int i = 1;i<=num1 || i<= num2;i++){
		    if(num1%i == 0 && num2%i == 0){
		        hcf = i;
		    }
		}
		int lcm = (num1*num2)/hcf;
		System.out.println(lcm);
		
	}
}

// 31th Binary to Decimal to conversion

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int n = (int)(Math.log10(num1))+1;
		int ans = 0;
		for(int i = 0;i<n;i++){
		    int var = (int)Math.pow(2,i);
		    ans += (num1%10 * var);
		    num1/=10;
		}
		System.out.print(ans);
	}
}

// 32th Greatest Common Divisor

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int hcf = 0;
		while (num1 != num2){
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        System.out.println("The HCF: "+ num1);
	}
}

// 33th Octal to Decimal conversion

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int n = (int)(Math.log10(num1))+1;
		int ans = 0;
		for(int i = 0;i<n;i++){
		    int var = (int)Math.pow(8,i);
		    ans += (num1%10 * var);
		    num1/=10;
		}
		System.out.print(ans);
	}
}

// 33th Hexadecimal to Decimal conversion

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hex = sc.next();
		String digits = "0123456789ABCDEF";  
		hex = hex.toUpperCase();  
		int val = 0;  
		for (int i = 0; i < hex.length(); i++)  {  
		    char c = hex.charAt(i);  
		    int d = digits.indexOf(c);  
		    val = 16*val + d;  
		}  
		System.out.print(val);
	}
}

// 34th Hexadecimal to Decimal conversion

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hex = sc.next();
		String digits = "0123456789ABCDEF";  
        hex = hex.toUpperCase();  
        int val = 0;  
        for (int i = 0; i < hex.length(); i++)  {  
            char c = hex.charAt(i);  
            int d = digits.indexOf(c);  
            val = 16*val + d;  
        }  
        System.out.print(val);
	}
}

// 35th Decimal to Binary conversion

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String bin = "";
		while(num!=0){
		    if(num%2==0){
		        bin=0 + bin;
		    }else{
		        bin=1 + bin;
		    }
		    num/=2;
		}
		System.out.print(bin);
	}
}

// 36th Decimal to Octal Conversion

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String oct = "";
		while(num!=0){
		    if(num%8==0){
		        oct=num%8 + oct;
		    }else{
		        oct=num%8 + oct;
		    }
		    num/=8;
		}
		System.out.print(oct);
	}
}

// 37th Decimal to Hexadecimal Conversion

import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		int rem;  
        String hex="";   
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
        while(decimal>0){  
            rem=decimal%16;   
            hex=hexchars[rem]+hex;   
            decimal=decimal/16;  
        }  
        System.out.print(hex);  
	}
}

// 38th Binary to Octal conversion

import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int n = (int)(Math.log10(num1))+1;
		int ans = 0;
		for(int i = 0;i<n;i++){
		    int var = (int)Math.pow(2,i);
		    ans += (num1%10 * var);
		    num1/=10;
		}
		int num = ans;
		String oct = "";
		while(num!=0){
		    if(num%8==0){
		        oct=num%8 + oct;
		    }else{
		        oct=num%8 + oct;
		    }
		    num/=8;
		}
		System.out.print(oct);
	}
}

//39th Octal to Binary conversion

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		int n = (int)(Math.log10(num1))+1;
		int ans = 0;
		for(int i = 0;i<n;i++){
		    int var = (int)Math.pow(8,i);
		    ans += (num1%10 * var);
		    num1/=10;
		}
		int num = ans;
		String bin = "";
		while(num!=0){
		    if(num%2==0){
		        bin=0 + bin;
		    }else{
		        bin=1 + bin;
		    }
		    num/=2;
		}
		System.out.print(bin);
	}
}

// 40th Quadrants in which a given coordinate lies

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if(X>0 && Y>0){
		    System.out.println("1st Quadrants");
		}else if(X<0 && Y>0){
		    System.out.println("2nd Quadrants");
		}else if(X<0 && Y<0){
		    System.out.println("3rd Quadrants");
		}else if(X > 0 && Y < 0){
		    System.out.println("4th Quadrants");
		}else if(X == 0 && Y == 0){
		    System.out.println("Origin");
		}else if(Y==0 && X != 0){
		    System.out.println("x-axis");
		}else if(X==0 && Y != 0){
		    System.out.println("x-axis");
		}
	}
}
