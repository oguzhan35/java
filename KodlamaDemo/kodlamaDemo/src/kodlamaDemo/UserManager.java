package kodlamaDemo;

public class UserManager {

	public void add(User user) {
		System.out.println("Eklendi "+user.firstName);
	}
	


   public void allList(User[] users) {
	 
	   for (User user : users) {
	     System.out.println(user.firstName+"-"+user.lastName);
	}
	   
    }
}
