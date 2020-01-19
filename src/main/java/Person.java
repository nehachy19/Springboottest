
public class Person 
{
	Integer age;
	String FName;
	String Lname;
	
	Person(Integer age,String FName,String Lname)
	{
		this.age=age;
		this.FName=FName;
		this.Lname=Lname;
	}
	public void setAge(Integer age)
	{
		this.age=age;
	}
	
	public void setFName(String Fname)
	{
		this.FName="FName";
	}
	
	public void setLname(String Lname)
	{
		this.Lname=Lname;
	}
	
	
	public Integer getAge()
	{
		return this.age;
	}
	
	public String getFName()
	{
		return this.FName;
	}
	
	public String getLname()
	{
		return this.Lname;
	}	
}

