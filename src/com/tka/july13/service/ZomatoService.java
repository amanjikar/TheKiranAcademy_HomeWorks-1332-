package com.tka.july13.service;
import java.util.ArrayList;

import com.tka.july13.entity.Z_user;
import com.tka.july13.repository.ZomatoDao;
public class ZomatoService {
	
	ZomatoDao obj=new ZomatoDao();
	public ArrayList<Z_user> getUserById() {
		return obj.getUserById();
		
	}
}
