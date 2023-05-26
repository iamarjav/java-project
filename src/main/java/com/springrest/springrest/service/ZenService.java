package com.springrest.springrest.service;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

import com.springrest.springrest.manager.Manager;
import com.springrest.springrest.userrepository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ZenService {
	
	@Autowired
	public UserRepository user_repo;
	
	public List<Manager> get_managers()
	{
		return user_repo.findAll();
	}
	
	public Manager update_manager(Manager manager,Integer id)
	{
		Manager man=user_repo.findById(id).get();
		man.setManager_name(manager.getManager_name());
		man.setManager_email_id(manager.getManager_email_id());
		man.setManager_phone(manager.getManager_phone());
		man.setManager_password(manager.getManager_password());
		return man;
	}
	
	public void save_manager(Manager manager)
	{
		user_repo.save(manager);
	}

	public Manager get_manager_by_id(Integer id)
	{
		return user_repo.findById(id).get();
	}
	
	public void delete_manager(Integer id)
	{
		try {
			user_repo.deleteById(id);
		}catch(Exception ecp) {
			
		}
		
	}
}
