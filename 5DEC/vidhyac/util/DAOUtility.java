package com.vidhyac.util;

import com.vidhyac.dao.IUserDAO;
import com.vidhyac.dao.UserDAO;
import com.vidhyac.dao.UserDAOVer2;

public class DAOUtility {
	//job of this class is to give
	public static IUserDAO getUserDAO() {
		//return new UserDAO();//creating object is abstract here...
		return new UserDAOVer2();
	}
}
