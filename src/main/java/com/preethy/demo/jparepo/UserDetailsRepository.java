package com.preethy.demo.jparepo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.preethy.demo.jpamodel.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Long>{
	List<UserDetails> findByID(String userid);
}
