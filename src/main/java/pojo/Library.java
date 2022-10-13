package pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Maths", 12);
        Book second = new Book("Geography", 23);
        Book third = new Book("Geometry", 34);
        Book fourth = new Book("Clean code", 45);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int i = 0; i < books.length; i++) {
          Book bk = books[i];
            System.out.println(bk.getTitleBook() + " - " + bk.getNumberOfPages() + " pages");
        }
        System.out.println();
        books[0] = fourth;
        books[3] = first;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getTitleBook() + " " + bk.getNumberOfPages() + " pages");
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getTitleBook())) {
                System.out.println(bk.getTitleBook() + " - " + bk.getNumberOfPages() + " pages");
            }
        }
    }
}
