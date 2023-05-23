package NetFlix;

import java.util.Arrays;
import java.util.Scanner;

public class NetFlix {
	

static Scanner sc=new Scanner(System.in);
User u;
Movies m;


public void Login(User[] u)
{
	System.out.println("Enter UserName: ");
	String uname=sc.next();
	System.out.println("Enter Phone Number");
	long phno=sc.nextLong();
	boolean cond=false;
	for(int i=0;i<u.length;i++)
	{
		if(uname.equals(u[i].getUname()))
		{
			System.out.println("Login Successfull!");
			cond=true;
		}
	}
	if(!cond)
	{
		System.out.println("Invalid Credentials!");
	}
	
}		


public void addMovie(Movies m)
{
	if(this.m==null)
		
	{
		this.m=m;
		System.out.println("Movie Added Successfully!");
	}
	
}
	
	public static void main(String[] args) 
	
	{

	NetFlix NF=new NetFlix();
		
					User u1=new	User("Priya","Priy@gmail.com",1234567800);
					User u2=new	User("Ammu","Ranjith@gmail.com",1234567801);
					User u3=new	User("Sai","Sai@gmail.com",1234567802);
					User u4=new	User("Banu","Banu@gmail.com",1234567803);
					User u5=new	User("Akshu","Akshu@gmail.com",1234567804);
					User u6=new	User("Venky","Venkat@gmail.com",1234567805);
					User u7=new	User("Raji","Rajeswari@gmail.com",1234567806);
					User u8=new	User("Bala","Mystery@gmail.com",1234567807);
					User u9=new	User("Kavi","Kaviya@gmail.com",1234567808);
					User u10=new User("Ramya","Ramya@gmail.com",1234567809);	
		
	User[] u= {u1,u2,u3,u4,u5,u6,u7,u8,u9,u10};
	
	
					Movies m1=new Movies("Tarz","2 hr 10 min",5);
					Movies m2=new Movies("OkKanmani","2 hr 11 min",5);
					Movies m3=new Movies("Bombay","2 hr 12 min",5);
					Movies m4=new Movies("Valimai","2 hr 13 min",3);
					Movies m5=new Movies("Varisu","2 hr 14 min",3);
					Movies m6=new Movies("MounaRagam","2 hr 15 min",5);
					Movies m7=new Movies("Priyasaki","2 hr 16 min",5);
					Movies m8=new Movies("Minnale","2 hr 17 min",5);
					Movies m9=new Movies("Aashiqui","2 hr 18 min",4);
					Movies m10=new Movies("Avatar","2 hr 19 min",4);
					
	Movies[] m= {m1,m2,m3,m4,m5,m6,m7,m8,m9,m10};
	
	//CREATING OBJECT FOR NETFLIX
	
		boolean flag=true;
		
		do
		{
		//DISPLAYING FEATURES
		System.out.println("*** NETFLIX ***");
		System.out.println("*** Watch UnLimited Movies,TV Shows & More ***");
		
		System.out.println("Enter Your Choice: \n"
							+ "1. Login \n"
							+ "2. Search Movie \n"
							+ "3. Sort Movies \n"
							+ "4. Get Movie Details \n"
							+ "5. Remove Movie \n"
							+ "6. Change Rating \n"
							+ "7. Change UserName \n"
							+ "8. Change Phone Number \n"
							+ "9. Display User Details \n"
							+ "10. Logout \n"
							+ "11. Exit ");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: //LOGIN
		{
			NF.Login(u);
		}
		break;	
		case 2: //SEARCH MOVIE
		{
			System.out.println("Enter a Movie Name to Search");
			
			String searchmname=sc.next();
			sc.nextLine();
			boolean cond=false;
			for(int i=0;i<m.length;i++)
			{
				if(searchmname.equals(m[i].getMname()))
				{
					System.out.println(m[i]);
					cond=true;
				}
			}
				if(!cond)
				{
					System.out.println("Movie Not Available");
				}
			
		}
		break;
		case 3://SORT MOVIES
		{
			Arrays.sort(m);//Coz of compareTo Overriding, we can sort this
			for(int i=0;i<m.length;i++)
			{
				System.out.println(m[i]);
			}
			
		}
		break;
		case 4://MOVIE DETAILS
		{
			for(int i=0;i<m.length;i++)
			{
			System.out.println(m[i]);
			}
		
		}
		break;
		case 5://REMOVE MOVIE
		{
			System.out.println("Enter a Movie Name to Remove");
			
			String removemname=sc.next();
			sc.nextLine();
			boolean cond=false;
			for(int i=0;i<m.length;i++)
			{
				if(removemname.equals(m[i].getMname()))
				{
					m[i]=new Movies("","",0);//Should not make m[i]=null; Instead of that Create a "new" Object in that place and pass (" ", " ",0.0) coz(String,String,double)				
					System.out.println("Movie Removed Successfully!");
					cond=true;
				}
			}
				if(!cond)
				{
					System.out.println("Movie Not Available");
				}
		}
		break;
		case 6://CHANGE RATING
		{
			System.out.println("Enter a Movie Name to Change the Rating");
			
			String searchmname=sc.next();
			sc.nextLine();
			boolean cond=false;
			for(int i=0;i<m.length;i++)
			{
				if(searchmname.equals(m[i].getMname()))
				{
					System.out.println("Enter Your Rating");
					int UrRating=sc.nextInt();
					m[i].setRating(searchmname,UrRating);
					cond=true;
				}
			}
				if(!cond)
				{
					System.out.println("Movie Not Available!");
				}
		}
		break;
		case 7://CHANGE USERNAME
		{
			System.out.println("Enter Old UserName: ");
			String oldUname=sc.next();
			System.out.println("Enter Phone Number");
			long phno=sc.nextLong();
			boolean cond=false;
			for(int i=0;i<u.length;i++)
			{
				if(oldUname.equals(u[i].getUname()))
				{
					System.out.println("Enter New UserName: ");
					String newUname=sc.next();
					u[i].setUname(phno, oldUname, newUname);
					System.out.println("UserName Changed Successfully!");
					cond=true;
				}
			}
			if(!cond)
			{
				System.out.println("Invalid Credentials!");
			}
		}
		break;
		case 8://CHANGE PHONE NUMBER
		{
			boolean cond=false;
			System.out.println("Enter Old Phone Number: ");
			long oldPhno=sc.nextLong();
			System.out.println("Enter New Phone Number");
			long newPhno=sc.nextLong();
			System.out.println("Enter UserName: ");
			String uname=sc.next();
			for(int i=0;i<u.length;i++)
			{
				if(uname.equals(u[i].getUname()))
				{
				u[i].setPhno(oldPhno,newPhno,uname);
				cond=true;
				}
			}
			if(!cond)
			{
				System.out.println("Invalid Credentials!");
			}
		
		}
		break;
		case 9://USER DETAILS
		{
			for(int i=0;i<u.length;i++)
			{
			System.out.println(u[i]);
			}
		}
		break;
		case 10://LOGOUT
		{
			System.out.println("Thanks For Watching Netflix!");
		}
		break;
		case 11://EXIT
		{
			flag=false;
		}
		break;
		default:
		{
			System.out.println("Invalid Choice");
		}
		}
		}
		while(flag);
}
}
