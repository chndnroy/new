package xyz;


public class testi {
	public static void main(String[] args)
	{
		printPattern();
	}

	static void printPattern(){

		int i,j,k;

		for (i = 1;i<=20; i++)
		{
		  System.out.print(i);
		  for(k=20-i;k>=1;k--)
		  System.out.print("*");
		  System.out.println("");
		      } 

}
}
