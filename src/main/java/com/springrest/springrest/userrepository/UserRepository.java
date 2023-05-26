package com.springrest.springrest.userrepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.manager.Manager;

@Repository
public interface UserRepository extends JpaRepository<Manager,Integer>{

}
