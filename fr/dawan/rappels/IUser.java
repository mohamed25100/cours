package fr.dawan.rappels;

/**
 * Classes filles: UserDAO
 * interface: a device or program enabling a user to communicate with a computer.
 */
public interface IUser {

	//Interface: pseudo classe abstraite qui ne contient que des méthodes abstraites
	void insert(User u);
	void update(User u);
	void supprimer(User u);
	default void test() 
	{ 
		System.out.println("Implémentation par defaut que les classes filles peuvent redéfinir");
		};
	static void text2() {};
	
}
