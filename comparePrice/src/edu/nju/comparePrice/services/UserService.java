package edu.nju.comparePrice.services;

import edu.nju.comparePrice.dao.UserDao;
import edu.nju.comparePrice.models.BaseUser;
import edu.nju.comparePrice.models.User;
import edu.nju.comparePrice.models.VerifyResult;

public class UserService {
	private UserDao userDao;
	
	public User findUser(int userId) {
		User user = userDao.find(userId);
		return user;
	}
	
	public VerifyResult userVerify(String idString, String password) {
		return verify(idString, password);
	}
	
	/**
	 * @return 用户id
	 */
	public int register(String username, String password) {
		int id = userDao.save(username, password);
		return id;
	}
	
	public VerifyResult adminVerify(String idString, String password) {
		return verify(idString, password);
	}
	
	private VerifyResult verify(String inputId, String inputPassword) {
		int id = 0;
		try {
			id = Integer.parseInt(inputId);
		} catch (NumberFormatException e) {
			return VerifyResult.ID_INVALID;
		}
		
		BaseUser localBaseUser = findBaseUser(id);
		if (localBaseUser == null) {
			return VerifyResult.ID_INVALID;
		}
		
		if (!inputPassword.equals(localBaseUser.getPassword())) {
			return VerifyResult.PASSWORD_INVALD;
		} else {
			return VerifyResult.PASS;
		}
	}
	
	private BaseUser findBaseUser (int id) {
		BaseUser baseUser = userDao.findBaseUser(id);
		return baseUser;
	}
}
