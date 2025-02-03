/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
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
    private boolean courseText;

    /**
     * Set the author and title fields when this object
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
    public String getAuthor() {
        return author;
    }
    
    public String getTitle() {
        return title;
    }
    
    // Exercise 2.85
    public int getPages() {
        return pages;
    }
    
    // Exercise 2.91
    public int getBorrowed() {
        return borrowed;
    }
    
    // Exercise 2.92
    public boolean isCourseText() {
        return courseText;
    }
    
    // Exercise 2.88
    public void setRefNumber(String ref) {
        // 2.90
        if (ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.out.println("Error: reference number too short to set");
        }
    }
    
    // Exercise 2.84 methods
    public void printAuthor() {
        System.out.println(author);
    }
    
    public void printTitle() {
        System.out.println(title);
    }
    
    // Exercise 2.86
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
    public void borrow() {
        borrowed += 1;
    }
}
