package Week1_home_assignment;

public class Library {

	String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
				
	}
	
	void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib=new Library();
		String name=lib.addBook("Naalukettu");
		System.out.println("Book title is  "+  name);
		lib.issueBook();

	}

}


