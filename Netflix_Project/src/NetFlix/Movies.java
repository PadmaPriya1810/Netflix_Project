package NetFlix;

import java.util.Objects;
import java.util.Scanner;

public class Movies implements Comparable{
	static Scanner sc=new Scanner(System.in);
	private String mname;
	private String duration;
	private double rating;
	
	Movies()
	{
		System.out.println("Select a Movie");
	}
	
	
	Movies(String mname, String duration) 
	{
		this.mname = mname;
		this.duration = duration;
	}


	Movies(String mname, String duration, double rating) 
	{
		this(mname,duration);
		this.rating = rating;
	}
	
	
	public String getMname()
	{
		return this.mname;
	}
	
	public String getDuration()
	{
		return this.duration;
	}
	
	public double getRating()
	{
		return this.rating;
	}

	public void setRating(String mname,double UrRating)
	{
		if(this.mname.equals(mname))
		{
			this.rating=UrRating;
			System.out.println("Rating Updated Successfully!");
		}
		else
		{
			System.out.println("Incorrect Movie Details!");
		}
	}
	@Override
	public String toString()
	{
		return "Movie Name :" + mname+"\t Movie Duration : "+duration+"\t\t Movie Rating :"+rating;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Movies m=(Movies)o;
		if(this.mname.equals(m.mname)&&this.duration.equals(m.duration)&&this.rating==m.rating)
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
		int a=Objects.hash(mname,duration,rating);
		return a;
	}

	@Override
	public int compareTo(Object o)
	{
		Movies m=(Movies)o;
		return (this.mname.compareTo(m.mname)); //For Comparing 2 Strings also we can use it
			
	}

}
