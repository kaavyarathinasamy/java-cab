package org.web.service;

import org.hibernate.Session;
import org.web.model.Signup;
//import org.web.model.Users;
//import org.web.model.Users;
import org.web.util.HBUtil;

public class SignupService {
	public static Signup get(String username){
		Session session = HBUtil.get().openSession();
		Signup signup = session.get(Signup.class,username);
		//Signup signup = session.get(Signup.class, username);
		//Signup signup = session.get(Signup.class, password);
		//Signup signup = session.get(Signup.class, emailid);
		//Signup signup = session.get(Signup.class, uphno);
		//Signup signup = session.get(Signup.class, gphno);
		//Signup signup = session.get(Signup.class, dateofbirth);
		//Signup signup = session.get(Signup.class, gender);
		session.close();
		return signup;
	}
public static void insert(String name,String username, String password,String emailid,long uphno,long gphno,String dateofbirth,String gender) {
	Session session = HBUtil.get().openSession();
	session.beginTransaction();
	Signup signup = new Signup();
	signup.setName(username);
	signup.setUsername(name);
	signup.setPassword(password);
	signup.setEmailId(emailid);
	signup.setUphno(uphno);
	signup.setGphno(gphno);
	signup.setDateofbirth(dateofbirth);
	signup.setGender(gender);
	session.save(signup);
	session.getTransaction().commit();
	session.close();

}}
