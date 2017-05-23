package data;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.User;
@Transactional 
@Repository 
public class AuthDAOImpl implements AuthDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private PasswordEncoder	encoder;
	

	@Override
	public User register(User user) {
		String passwordSha = encoder.encode(user.getPassword());
		user.setPassword(passwordSha);
		em.persist(user);
		em.flush();
		return user;
	}

	@Override
	public User logIn(User user) throws NoResultException{
		String q = "SELECT u FROM User u WHERE u.username = :uname";
		User managedUser = em.createQuery(q, User.class).setParameter("uname", user.getUsername()).getSingleResult();
		if(encoder.matches(user.getPassword(), managedUser.getPassword())){
			return managedUser;
		}
		else{
		return null;
		}
	}

}
