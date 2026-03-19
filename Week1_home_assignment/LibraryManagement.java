package Week1_home_assignment;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib1=new Library();
		String name=lib1.addBook("Poems");
	    System.out.println("Book name is "+name);
		lib1.issueBook();
	}

}
