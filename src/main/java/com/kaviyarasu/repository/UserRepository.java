package com.kaviyarasu.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kaviyarasu.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query(value = "select * from user2 where user_name=?1 and password=?2 and user_status =?3",nativeQuery = true)
	public User findByUserNmaeAndPassword(String user_name,String password, String user_status);

}
