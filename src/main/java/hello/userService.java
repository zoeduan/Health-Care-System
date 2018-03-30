package hello;


import java.util.List;

import hello.UserTest;

public interface userService {
	
	UserTest findById(Long id);

	UserTest findByEmail(String name);

	void saveUser(UserTest user);

	void updateUser(UserTest user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<UserTest> findAllUsers();

	boolean isUserExist(UserTest user);
}
