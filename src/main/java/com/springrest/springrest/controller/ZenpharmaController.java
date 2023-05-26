package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.manager.Manager;
import com.springrest.springrest.service.ZenService;


@RestController
@CrossOrigin("http://localhost:3000")
public class ZenpharmaController {
	
	@Autowired
	private ZenService zenservice;
	
	@GetMapping("/")
	public List<Manager> index() {
		return zenservice.get_managers();
	}
	
	@PostMapping(value="/managers/add_manager",consumes = {"*/*"})
	public void add_manager(@RequestBody Manager manager)
	{
		zenservice.save_manager(manager);
	}
	
	@DeleteMapping(value="/managers/delete/{manager_id}")
	public void delete_manager(@PathVariable("manager_id") Integer id)
	{
		try {
			zenservice.delete_manager(id);
		}
		catch(Exception exp){
			System.out.println(exp.toString());
		}
	}
	
	@GetMapping("/managers/manage")
	public String managers_manage() {
		return "managers";
	}
	
	@GetMapping(value="/managers/get_manager/{manager_id}")
	public Manager get_manager_by_id(@PathVariable("manager_id") Integer id) {
		Manager man=null;
		if(zenservice.get_manager_by_id(id)!=null)
		{
			return zenservice.get_manager_by_id(id);
		}
		else {
			return null;
		}
	}
	
	@PutMapping(value="/managers/update_manager/{manager_id}")
	public Manager update_manager(@PathVariable("manager_id") Integer id,@RequestBody Manager manager)
	{
		Manager m=null;
		if(zenservice.get_manager_by_id(id)!=null)
		{
			m=zenservice.update_manager(manager, id);
		}
		return m;
	}

}
