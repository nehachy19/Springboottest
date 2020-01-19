import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest
{


    @Test
    public void setAgeTest()
    {
        Person a1=new Person(40,"Neha","Kumari");


        a1.setAge(45);
        int ActualOutput=a1.getAge();
        assertEquals(45, ActualOutput);

    }
@Test
    public void getAgeTest()
    {
        Person a2=new Person(50,"Tarun","Vats");
       int AcctualOutput2= a2.getAge();
       assertEquals(50,AcctualOutput2);
    }
}
