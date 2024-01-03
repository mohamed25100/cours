package fr.dawan.rappels;

import fr.dawan.rappels.IUser;

// implements def: to start using a plan or system
public class UserDAO implements IUser{

	@Override
	public void insert(User u) {
		
	}

	@Override
	public void update(User u) {
		
	}

	@Override
	public void supprimer(User u) {

	}

	@Override
	public void test() {
		IUser.super.test();
	}
}