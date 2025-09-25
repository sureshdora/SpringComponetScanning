package com.suresh.repo;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {

	int age=18;
	public UserRepo() {
		System.out.println("I AM IN USERREPO CLASS(JAI JAGANNATH)");
	}
}
