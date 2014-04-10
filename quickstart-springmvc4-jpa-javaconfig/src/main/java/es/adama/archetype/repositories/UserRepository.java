package es.adama.archetype.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import es.adama.archetype.domain.User;
/**
 * 
 * @author David Palomar
 * www.adamaconsulting.es
 *
 */
public interface UserRepository extends JpaRepository<User, Long>{

}
