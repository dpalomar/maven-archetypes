/**
 * 
 */
package es.adama.archetype.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.adama.archetype.domain.User;
import es.adama.archetype.repositories.UserRepository;



/**
 * @author David Palomar
 *
 */
@Service
@Transactional
public class UserService 
{
	@Autowired private UserRepository userRepository;
	
	public List<User> findAllUsers() {
		return  userRepository.findAll();
	}

	public User createUser(User user){
		return userRepository.save(user);
	}
	
	public void deleteUser(User user){
		userRepository.delete(user);
	}
	
	public User updateUser(User user){
		
		return userRepository.save(user);
	}
	public User findUser(Long pk){
		return userRepository.findOne(pk);
	}
	
}
