
public class UserManager {
	
	public void add(User[] users) {
		for(User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
		
	}
	public void add(Student[] users) {
		for(Student user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getSchoolId());
		}
		
	}
	public void add(Instructor[] users) {
		for(Instructor user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getBrans());
		}
		
	}
	
	

}
