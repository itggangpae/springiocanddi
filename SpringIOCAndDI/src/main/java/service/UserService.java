package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import domain.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public User getUser(){
		return userDao.getUser();
	}
}
