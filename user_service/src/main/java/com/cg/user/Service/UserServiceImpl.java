package com.cg.user.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.cg.user.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list = List.of(
			new User(122l, "Yogeesh", "92782918"),
			new User(325l,"sam","4267234"));

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
	 return list.stream().filter(user -> user.getUserid().equals(id)).findAny().orElse(null);
	}
}