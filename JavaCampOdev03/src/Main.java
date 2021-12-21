
public class Main {

	public static void main(String[] args) {
		
		Student student1 =new Student();
		student1.setFirstName("Burak");
		student1.setLastName("Bulut");
		student1.setSchoolId("45678");
		
		Instructor instructer1 = new Instructor();
		instructer1.setFirstName("Yunus");
		instructer1.setLastName("Balık");
		instructer1.setBrans("SchoolTeacher");
		
		
		User[] users = {student1,instructer1};
		UserManager usermanager =new UserManager();
		usermanager.add(users);
		
		System.out.println();
		
		Student[] ogrenciler = {student1};
		usermanager.add(ogrenciler);
		
		
		Instructor[] egitimciler = {instructer1};
		usermanager.add(egitimciler);
		
		
		

	}

}
