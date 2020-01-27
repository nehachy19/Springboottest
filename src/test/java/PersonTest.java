import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import project.controllers.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest
{
    Person a1=null;
    @Before
    public void setVales()
    {
        a1=new Person(40,"Neha","Kumari");
    }

    @Test
    public void setAgeTest()
    {
        int expectedOutput=45;
        a1.setAge(expectedOutput);
        int ActualOutput=a1.getAge();
        assertEquals(expectedOutput, ActualOutput);
    }
    @Test
    public void getAgeTest()
    {
        int Expexctedage=40;
        int AcctualOutput2= a1.getAge();
        assertEquals(Expexctedage,AcctualOutput2);
    }
    @Test
    public void setFnameTest()
    {
        String expectectedFname="Kakku";
        a1.setFName(expectectedFname);
        String ActualFname= a1.getFName();
        assertEquals(expectectedFname, ActualFname);
    }
    @Test
    public void getFname()
    {
        String ExpexctFname="Neha";
        String AcctualFname= a1.getFName();
        assertEquals(ExpexctFname,AcctualFname);
    }
    @Test
    public void setLname()
    {
        String ExpectedLname="Vats";
        a1.setLname(ExpectedLname);
        String ActualLname=a1.getLname();
        assertEquals(ExpectedLname, ActualLname);
    }
    @Test

        public void getLname()
            {
                 String ExpectedLname="Kumari";
                 String ActualLname=a1.getLname();
                 assertEquals(ExpectedLname, ActualLname);

            }



    @After
    public void destroy()
    {
        a1=null;
    }
}
