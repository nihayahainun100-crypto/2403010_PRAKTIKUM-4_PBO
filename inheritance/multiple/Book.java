package inheritance.multiple;

public class Book implements Printable, Scrollable {
    private String title;
    private String content;
    private int pageCount;
    private int currentPage;
    
    public Book(String title, String content, int pageCount) {
        this.title = title;
        this.content = content;
        this.pageCount = pageCount;
        this.currentPage = 1;
    }
    
    
    public void print() {
        System.out.println("Mencetak buku: " + title);
        System.out.println("Konten: " + content);
    }
    
    
    public String getContent() {
        return content;
    }
    
    
    public void scroll() {
        currentPage++;
        if (currentPage > pageCount) {
            currentPage = 1;
        }
        System.out.println("Sekarang di halaman: " + currentPage);
    }
    
    
    public int getPageCount() {
        return pageCount;
    }
    
    public void displayInfo() {
        System.out.println("Judul: " + title);
        System.out.println("Jumlah halaman: " + pageCount);
        System.out.println("Halaman saat ini: " + currentPage);
    }
    
    // Getter dan Setter
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getCurrentPage() {
        return currentPage;
    }
    
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    
}
