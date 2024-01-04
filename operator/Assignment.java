package operator;

public class Assignment {

	public static void main(String[] args) 
	{
		int x=10; int y = 20;
		int ans=+x;
		System.out.println("+x="+ans);
		ans=-y;
		System.out.println("-y="+ans);
		ans=++x;
		System.out.println("++x="+ans);
		ans=--y;
		System.out.println("--y="+ans);
		ans=x++;
		System.out.println("x++="+ans);
		ans=y--;
		System.out.println("y--="+ans);
		}
	}
