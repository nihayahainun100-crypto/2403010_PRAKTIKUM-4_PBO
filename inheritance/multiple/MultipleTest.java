package inheritance.multiple;

public class MultipleTest {
     public static void main(String[] args) {
        Book book = new Book("Pemrograman Java", "Ini adalah konten buku tentang Java...", 100);
        
        System.out.println("=== Informasi Buku ===");
        book.displayInfo();
        
        System.out.println("\n=== Method dari Printable ===");
        book.print();
        System.out.println("Konten: " + book.getContent());
        
        System.out.println("\n=== Method dari Scrollable ===");
        System.out.println("Total halaman: " + book.getPageCount());
        book.scroll();
        book.scroll();
        book.scroll();
        
        System.out.println("\n=== Polymorphism dengan Interface ===");
        Printable printableBook = book;
        Scrollable scrollableBook = book;
        
        System.out.println("--- Sebagai Printable ---");
        printableBook.print();
        
        System.out.println("--- Sebagai Scrollable ---");
        scrollableBook.scroll();
        System.out.println("Halaman: " + scrollableBook.getPageCount());
    }
}
