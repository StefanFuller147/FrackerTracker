package data;

import entities.User;

public interface UserDAO {
	public User create(User user);
	public boolean destroy(int userId);
	public User update(User user, int id);

}
