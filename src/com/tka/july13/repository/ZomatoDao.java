package com.tka.july13.repository;
import java.util.ArrayList;

import com.tka.july13.entity.Z_user;

public class ZomatoDao {
	ArrayList <Z_user> list=new ArrayList<>();
	
	public ZomatoDao() {
		list.add(new Z_user(1,"Aman","aman@hotmail.com"));
		list.add(new Z_user(2,"Rohit","r@gmail.com"));
		list.add(new Z_user(3,"Jay","j@outlook.com"));
		list.add(new Z_user(4,"Nman","nman@hotmail.com"));
		list.add(new Z_user(5,"Ronin","rn@gmail.com"));
		list.add(new Z_user(6,"Jaya","jaya@outlook.com"));
		
		
	}
	
	public ArrayList<Z_user> getUserById() {
		return list;
	}
}
