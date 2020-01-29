import org.junit.Before;
import org.junit.Test;
import project.controllers.Person;
import project.controllers.Product;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductTest
{
    Product a1=null;
    @Before
    public void setVales() {
        Date D = null;
        List<String> Tag = null;
        a1 = new Product("34567890", "MIoNE", "SmartPhone", "MI", Tag, "Phone", D);
    }
        @Test
        public void setIdTest()
        {
            String expectedOutput="34567890";
            a1.setId(expectedOutput);
            String ActualOutput=a1.getId();
            assertEquals(expectedOutput, ActualOutput);
        }

    @Test
    public void getIdTest()
    {
        String expectedOutput="34567890";
        String ActualOutput=a1.getId();
        assertEquals(expectedOutput, ActualOutput);
    }

    @Test
    public void setNameTest()
    {
        String expectedOutput="MIoNE";
        a1.setName(expectedOutput);
        String ActualOutput=a1.getName();
        assertEquals(expectedOutput, ActualOutput);
    }

    @Test
    public void getNAmeTest()
    {
        String expectedOutput="MIoNE";
        String ActualOutput=a1.getName();
        assertEquals(expectedOutput,ActualOutput);
    }
    @Test
    public void setDescriptionTest()
    {
        String expectedOutput="Nice Phone";
        a1.setDescription(expectedOutput);
        String ActualOutput=a1.getDescription();
        assertEquals(expectedOutput, ActualOutput);
    }
    @Test
    public void getDescriptionTest()
    {
        String expectedOutput="SmartPhone";
        String ActualOutput=a1.getDescription();
        assertEquals(expectedOutput,ActualOutput);
    }
    @Test
    public void setBrandTest()
    {
        String expectedOutput="Google";
        a1.setBrand(expectedOutput);
        String ActualOutput=a1.getBrand();
        assertEquals(expectedOutput, ActualOutput);
    }
    @Test
    public void getBrandTest()
    {
        String expectedOutput="MI";
        String ActualOutput=a1.getBrand();
        assertEquals(expectedOutput,ActualOutput);
    }
    @Test
    public void setTagTest()
    {
        List<String> expectedOutput=null;
        a1.setTags(expectedOutput);
        List<String> ActualOutput=a1.getTags();
        assertEquals(expectedOutput, ActualOutput);
    }
    @Test
    public void getTagTest()
    {
        List<String> expectedOutput=null;
        List<String> ActualOutput=a1.getTags();
        assertEquals(expectedOutput,ActualOutput);
    }
    @Test
    public void setCategoryTest()
    {
        String expectedOutput="Laptop";
        a1.setCategory(expectedOutput);
        String ActualOutput=a1.getCategory();
        assertEquals(expectedOutput, ActualOutput);
    }
    @Test
    public void getCategoryTest()
    {
        String expectedOutput="Phone";
        String ActualOutput=a1.getCategory();
        assertEquals(expectedOutput,ActualOutput);
    }
    @Test
    public void setDateTest()
    {
        Date expectedOutput=null;
        a1.setCreatedAt(expectedOutput);
        Date ActualOutput=a1.getCreatedAt();
        assertEquals(expectedOutput, ActualOutput);
    }
    @Test
    public void getDateTest()
    {
        Date expectedOutput=null;
        Date ActualOutput=a1.getCreatedAt();
        assertEquals(expectedOutput,ActualOutput);
    }


    }

