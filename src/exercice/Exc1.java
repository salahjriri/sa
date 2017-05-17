package exercice;

public class Exc1 {

	public static int calcul(int num)
	{ 	int  s=0;
		int  z=0;
		int  k=0;
		int  f=0;
	s=  num/100;
	z = num- (s*100);
	k = z/10;
		
	f= num - (s*100+k*10);
	if(num<=99&&num>=10)
	{
		k =num/10;
		f= num -k*10;
	}
	else if (num<10&&num>0) return num;
	else if (num==1000)return num/1000;
	
	
		
		
		
		return f+s+k;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(calcul(110));

	}

}
