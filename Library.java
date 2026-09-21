class Library {
    String title;
    String author;
    double price;

    static int bookCount = 0;

    Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    static void displayBookCount() {
        System.out.println("Total Books: " + bookCount);
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Library b1 = new Library("Java Programming", "James", 500);
        Library b2 = new Library("Python Basics", "Guido", 450);
        Library b3 = new Library("AI Fundamentals", "Andrew", 600);

        b1.display();
        b2.display();
        b3.display();

        Library.displayBookCount();
    }
}
