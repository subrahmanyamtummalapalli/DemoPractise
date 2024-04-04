package pratic;

public class Sample {
	public void duplicate() {
		String s = "i am an automation tester";
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
				}
			}
		}

	}

	public static void minarray() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println(min);
	}

	public static void maxarray() {
		int aa[] = { 1, 2, 3, 4, 5, 6, 7 };
		int max = aa[0];
		for (int j = 0; j < aa.length; j++) {
			if (aa[j] > max) {
				max = aa[j];
			}
		}
		System.out.println(max);
	}

	public static void fib() {
		int count = 7;
		int num1 = 1;
		int num2 = 0;
		for (int i = 1; i < count; i++) {
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.println(num1);
		}

	}
	void sncs() {
		String s1="Rameshsir@!123";
		String n=s1.replaceAll("[^0-9]", "");
		System.out.println(n);
	}

	public static void prime() {
		int n = 7;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not a prime");
		}
	}
		public static void Stringrevers()
		{
			String ss="mom";
			String rev="";
			for(int i=ss.length()-1;i>=0;i--)
				
			{
				rev=rev+(ss.charAt(i));
			}
			System.out.println(rev);
			if(ss.equals(rev))
			{
				System.out.println("this string is palandrom");
			}
			else
			{
				System.out.println("this string is not a palandrom");
			}
		}
		static void swapwithouttemp()
		{
			int a=10;
			int b=20;
			System.out.println(a+"   "+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a+"    "+b);
			
		}
	public static void numberpalandrom()
	{
		int n=7;
		int temp=n;
		int rev=0;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp == rev)
		{
			System.out.println("palandrom");
		}
		else {
			System.out.println("not a palandrom");
		}
	}
	void sumofarray()
	{
		int s[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<s.length;i++)
		{
			sum=sum+s[i];
			
		}
		System.out.println(sum);
	}
	public static void missingnumberinarray() {
	    int a[] = {1, 2, 4, 5};
	    int sum = 0;
	    for (int i = 0; i < a.length; i++) {
	        sum = sum + a[i];
	    }
	    System.out.println(sum);
	    int sum1 = 0;
	    for (int i = 1; i <= 5; i++) { // Change the loop iteration to include 1 to 5
	        sum1 = sum1 + i;
	    }
	    System.out.println(sum1);
	    System.out.println(sum1 - sum); // Calculate the missing number
	}
	public static void swapuseingtemp()
	{
		int a=10;
		int b=20;
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
	public static void vowels()
	{
		String s="hello world";
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		
		{
			char ch=s.charAt(i);
			if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' )
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	public void swit()
	{
		int number=20;
		switch(number)
		{
		case 10:
			System.out.println("10");
			
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("20");
			break;
		}
	}

	
	public static void main(String[] args) {
		Sample s = new Sample();
	//s.duplicate();
//		Sample.minarray();
//		Sample.maxarray();
		//Sample.fib();
//		s.sncs();
//		s.prime();
//		s.Stringrevers();
//		s.swapwithouttemp();
//		
		//s.numberpalandrom();
		//s.sumofarray();
		//s.missingnumberinarray();
		//s.swapuseingtemp();
		//s.vowels();
	s.swit();
		
	}

}
