package ch21;

public class BookArrayTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];

//        for (int i = 0; i < library.length; i++) {
//            System.out.println(library[i]);
//        }

        library[0] = new Book("wow1", "lee");
        library[1] = new Book("wow2", "lee");
        library[2] = new Book("wow3", "lee");
        library[3] = new Book("wow4", "lee");
        library[4] = new Book("wow5", "lee");

        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

    }

}
