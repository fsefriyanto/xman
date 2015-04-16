/**
 * 
 */
package com.xman.springapp.dao;

import java.util.List;

import com.xman.springapp.entities.User;

/**
 * @author fandy
 *
 */
public interface UserDao {

	public List<User> findAll();
	
	public User create(User user);
	
	public User findUserById(int id);

	public User login(String email, String password);
	
}
