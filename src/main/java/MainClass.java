
import java.awt.List;
import java.util.ArrayList;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class MainClass 
{
		static ArrayList<Person> pList= new ArrayList<Person>();
		@RequestMapping("/")
	    String home() 
		{
	        return "Hello Docker Test app!";
	    }
			
		@GetMapping("/person/{name}")
		@ResponseBody
		public Person getPerson(@PathVariable String name) 
		{			
			for(int i=0; i<pList.size();i++)
			{				
				if(pList.get(i).getFName().equals(name))
					return pList.get(i);				
			}
			return null;
			
		}
		@GetMapping("/person")
		@ResponseBody
		public ArrayList<Person> showAllPerson()
		{			
			return pList;
		}
		@PostMapping("/person")
		@ResponseBody
		public Person postPerson(@RequestBody Person p)
		{
			pList.add(p);			
			return p;
		}
		@PutMapping("/person")
		@ResponseBody
		public Person putPerson(@RequestBody Person p)
		{
			for(int i=0; i<pList.size();i++)
			{				
				if(pList.get(i).getFName().equals(p.getFName()))
				{
					pList.add(i, p);
					return p;
				}
			}
			return null;
		}
		
	

    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
        Person p1 = new Person(30,"Tarun","Vats");	
		Person p2 = new Person(26,"Vikas","Vats");
		Person p3 = new Person(17,"Harsh rsh","Vats");
		Person p4 = new Person(27,"Kaku","Chaudhary");			
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
    }
}
