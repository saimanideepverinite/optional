package optaionalClass;
import java.util.*;

public class OptionalClass   {
	static String name()
	{
		return "sai";
	}
	public String n()
	{
		return "Hello world";
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr string values");
		String str1=sc.nextLine();
		//ofNullable
		Optional opt=Optional.ofNullable(str1);
		System.out.println(opt);
		//of
		opt=Optional.of(str1);
		System.out.println(opt);
		int x=5,y=10;
		//OrElse
		String a="you picked null";
		String str3=null;
		
		String str2=Optional.ofNullable(str3).orElse(a);
		System.out.println(str2);
		//calling static method		
		 str2=Optional.ofNullable(str3).orElse(name());		
		 System.out.println(str2);
		 //orElseGet		 
		 str2=Optional.ofNullable(str3).orElseGet(()->"SMD");			
		 System.out.println(str2);
		 //trows exception
		 str2=Optional.ofNullable(str3).orElseThrow(()->new Exception("given Null value"));			
		 System.out.println(str2);

	}

}
