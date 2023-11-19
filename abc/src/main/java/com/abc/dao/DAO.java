package com.abc.dao;

import java.util.ArrayList;
import java.util.List;

import com.abc.entity.User;

public class DAO {
	
public static List <User> userList = new ArrayList<>(); 

public static void addUser(User user) {
	userList.add(user);
}


}
