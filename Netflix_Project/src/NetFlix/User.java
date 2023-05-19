package NetFlix;

import java.util.Objects;
import java.util.Scanner;

public class User {

	static Scanner sc=new Scanner(System.in);
	
	private String uname;
	private String mail_id;
	private long phno;
	
	User()
	{
		System.out.println("Create A Netflix Account");
	}

	User(String uname, String mail_id, long phno)
	{
		this.uname = uname;
		this.mail_id = mail_id;
		this.phno = phno;
	}

	User(String mail_id, long phno) 
	{
		this.mail_id = mail_id;
		this.phno = phno;
	}
	
	User(long phno)
	{
		this.phno=phno;
	}
	
	
	public String getUname()
	{
		return this.uname;
	}
	
	public String getMailId()
	{
		return this.mail_id;
	}
	
	public long getPhno()
	{
		return this.phno;
	}
	
	public void setUname(long phno,String oldUname,String newUname)
	{
		if(this.phno==phno&&this.uname==oldUname)
		{
			this.uname=newUname;
			System.out.println("UserName Changed Successfully!");
		}
//		else
//		{
//			System.out.println("Invalid Credentials!");
//		}
	}
	
	public void setPhno(long oldPhno, long newPhno,String uname)
	{
		if(this.phno==oldPhno&&this.uname.equals(uname))
		{
			this.phno=newPhno;
			System.out.println("Phone Number Updated Successfully!");
		}
		else
		{
			System.out.println("Invalid Credentials!");
		}
	}
	
	@Override
	public String toString()
	{
		return "UserName :" + uname+"\t Phone Number : "+phno+"\t Mail Id :"+mail_id;
	}
	
	@Override
	public boolean equals(Object o)
	{
		User u=(User)o;
		if(this.uname.equals(u.uname)&&this.phno==u.phno)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		int a=Objects.hash(uname,phno,mail_id);
		return a;
	}

}