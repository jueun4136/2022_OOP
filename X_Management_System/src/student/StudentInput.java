package student;

import java.util.Scanner;

public interface StudentInput {
	public void getUserInput(Scanner input);
	public String getId();
	public String getName();
	public String getEmail();
	public String getPhone();
	public void setId(String id);
	public void setName(String name);
	public void setPhone(String email);
	public void setAddress(String address);

	public void printInfo();
}
