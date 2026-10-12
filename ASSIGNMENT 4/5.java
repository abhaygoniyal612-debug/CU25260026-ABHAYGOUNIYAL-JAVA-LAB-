class Book {
    String title;
    String author;
    double price;
    static String publisher = "Penguin";

    void display() {
        String bookTitle = title;
        String bookAuthor = author;
        double bookPrice = price;

        System.out.println("Publisher: " + publisher);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: " + bookPrice);
    }

    public static void main(String[] args) {
        Book b = new Book();

        String t = "Java Programming";
        String a = "James Gosling";
        double p = 500;

        b.title = t;
        b.author = a;
        b.price = p;

        b.display();
    }
}