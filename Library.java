package week1.homework;

public class Library {
	public String addBook(String bookTitle) {
	System.out.println("Book added successfully");	
	return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String args[]) {
		Library l=new Library();
		String title=l.addBook("Kalam");
		l.issueBook();
	}
}
