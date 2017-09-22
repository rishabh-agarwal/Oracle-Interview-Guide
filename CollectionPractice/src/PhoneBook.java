import java.util.*;

public class PhoneBook {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Map<String, String> phoneBook = new HashMap<String, String>();
		
		System.out.println("Enter the size of Phone Book:");
		int n = scan.nextInt();
		System.out.println("Now Enter the name and phone Number:");
		for (int i = 0; i < n; i++) {
			String name = scan.next();
			String phone = scan.next();
			phoneBook.put(name, phone);
		}
		
		System.out.println("Enter the name you want to find:");
		while (scan.hasNext()) {
			String s = scan.next();
	         if(!s.isEmpty()) { 
				if( phoneBook.get(s) != null)
	            {
	            	  System.out.println(phoneBook.get(s));
	            }
	            else {
	            	System.out.println("Not Found!");
	            }
	          }
		}
		scan.close();
	}

}
