package ch21;

public class ObjectCopy {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("wow1", "lee");
        library[1] = new Book("wow2", "lee");
        library[2] = new Book("wow3", "lee");
        library[3] = new Book("wow4", "lee");
        library[4] = new Book("wow5", "lee");

        // 얕은 복사
        System.arraycopy(library, 0, copyLibrary, 0, 5);

        System.out.println("===library===");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("===copyLibrary===");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }

        library[0].setTitle("oh...");
        library[0].setAuthor("this is shallow");

        System.out.println(library[0]);
        library[0].showInfo();
        System.out.println(copyLibrary[0]);
        copyLibrary[0].showInfo();

    }


}

class ObjectCopy2 {

    // 깊은 복사
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibaray = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        copyLibaray[0] = new Book();
        copyLibaray[1] = new Book();
        copyLibaray[2] = new Book();
        copyLibaray[3] = new Book();
        copyLibaray[4] = new Book();

        for(int i = 0; i< library.length; i++) {
            copyLibaray[i].setTitle(library[i].getTitle());
            copyLibaray[i].setAuthor(library[i].getAuthor());
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("======library=========");
        for( Book book : library) {
            book.showInfo();
        }

        System.out.println("======copy library=========");
        for( Book book : copyLibaray) {
            book.showInfo();
        }
    }
}
