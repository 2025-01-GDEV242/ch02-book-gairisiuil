/**
 * A class that tracks book information, like author, title,
 * amount of pages, reference number, whether it's been borrowed,
 * and whether it's being used as a course textbook.
 *
 * @author Aidan O'Connell
 * @version 2025-02-03_01
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    // Exercise 2.88
    private String refNumber;
    // Exercise 2.85
    private int pages;
    // Exercise 2.91
    private int borrowed;
    // Exercise 2.92
    private final boolean courseText;

    /**
     * Set author, title, pages, and isText fields when this object
     * is constructed.
     */                                              // 2.85
    public Book(String bookAuthor, String bookTitle, int bookPages,
    /* 2.92 */  boolean isText)
    {
        author = bookAuthor;
        title = bookTitle;
        // 2.85
        pages = bookPages;
        // 2.88
        refNumber = "";
        // 2.91 (not explicitly mentioned, makes things go smoother)
        borrowed = 0;
        // 2.92
        courseText = isText;
    }

    // Add the methods here ...
    
    // Exercise 2.83 methods
    /** Returns the author's name.
     */
    public String getAuthor() {
        return author;
    }
    
    /** Returns the title of the book.
     */
    public String getTitle() {
        return title;
    }
    
    // Exercise 2.85
    /** Returns the number of pages.
     */
    public int getPages() {
        return pages;
    }
    
    // Exercise 2.91
    /** Returns whether the book has been borrowed.
     */
    public int getBorrowed() {
        return borrowed;
    }
    
    // Exercise 2.92
    /** Returns whether it's a textbook for a course.
     */
    public boolean isCourseText() {
        return courseText;
    }
    
    // Exercise 2.88
    /** Sets the reference number.
     * @param ref the reference number for the book
     */
    public void setRefNumber(String ref) {
        // 2.90
        if (ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.out.println("Error: reference number too short to set");
        }
    }
    
    // Exercise 2.84 methods
    /** Prints the author of the book.
     */
    public void printAuthor() {
        System.out.println(author);
    }
    
    /** Prints the title of the book.
     */
    public void printTitle() {
        System.out.println(title);
    }
    
    // Exercise 2.86
    /** Prints most of the information about the book (textbook status
     *  is excluded.)
     */
    public void printDetails() {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book pages: " + pages);
        
        // Exercise 2.89
        if (refNumber.length() != 0) {
            System.out.println("Reference #: " + refNumber);
        } else {
            System.out.println("ZZZ");
        }
        
        // Exercise 2.91
        System.out.println("Has been borrowed " + borrowed + " times");
    }
    
    // Exercise 2.91
    /** "Borrows" the book by adding 1 to its borrow record
     */
    public void borrow() {
        borrowed += 1;
    }
}
