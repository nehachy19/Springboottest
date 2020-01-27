package project.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController
{
	static ArrayList<Person> pList= new ArrayList<Person>();
	@RequestMapping("/")
    String home() 
	{
        return "Hello Docker Test app!: v2";
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
	
}
