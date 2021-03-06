package com.financial.repository;

//import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.financial.model.User;

//@RepositoryRestResource(collectionResourceRel = "user", path = "user")
@RepositoryRestResource(exported = false)
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
	public User findByEmail(String email);
}