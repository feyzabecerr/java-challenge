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

		// filter from userService users which are unverified and under 18 years old

		return userService.list().stream().filter(user -> !(user.isVerified()) && user.getAge() < 18).collect(Collectors.toList());

	}

	@Override
	public List<User> verifiedWithTrPrimaryPhone() {
		//filter from userService users which are verified and have TR primary phone number

		return userService.list().stream().filter(user -> user.isVerified() && user.getProfile().getTrPrimaryPhone()).collect(Collectors.toList());

	}
}
