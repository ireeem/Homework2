package homework2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " is added.");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " is updated.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " is deleted.");
	}
	public void login(User user) {
		System.out.println(user.getFirstName() + " logged in.");
	}
	public void logout(User user) {
		System.out.println(user.getFirstName() + " logged off.");
	}
	public void getAll() {
		System.out.println("Users are listed.");
	}
}