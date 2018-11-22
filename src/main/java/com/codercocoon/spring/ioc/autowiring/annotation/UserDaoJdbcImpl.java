package com.codercocoon.spring.ioc.autowiring.annotation;

import org.springframework.stereotype.Repository;

/**
 * 
 * @author contact@codercocoon.com
 *
 */

@Repository
public class UserDaoJdbcImpl implements UserDao {

	@Override
	public void insert(User user) {
		
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public void delete(int userId) {
		
	}

	@Override
	public User find(int userId) {
		return null;
	}

	@Override
	public void lockAccount(int userId, boolean locked) {
		
	}
}
