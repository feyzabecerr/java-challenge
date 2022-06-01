package com.kodgemisi.filter;

import com.kodgemisi.usermanagement.User;
import com.kodgemisi.usermanagement.UserService;

import java.util.List;
import java.util.stream.Collectors;

public class FilterApiImpl implements FilterApi {

	private final UserService userService;

	public FilterApiImpl(UserService userService) {
		this.userService = userService;
	}

	@Override
	public List<User> unverifiedUnder18() {

		//FIXME currently returns all the users unfiltered, you should fix this method
		// If you are not sure how to implement this method, please refer to the Javadoc or the FilterApi interface

		return userService.list().stream().filter(user -> !(user.isVerified()) && user.getAge() < 18).collect(Collectors.toList());

	}

	@Override
	public List<User> verifiedWithTrPrimaryPhone() {
		//FIXME currently returns all the users unfiltered, you should fix this method
		// If you are not sure how to implement this method, please refer to the Javadoc or the FilterApi interface
		return userService.list().stream().filter(user -> user.isVerified() && user.getProfile().getTrPrimaryPhone()).collect(Collectors.toList());

	}
}
