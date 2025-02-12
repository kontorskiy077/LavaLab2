class Book {
    protected String title;
    protected String author;
    protected int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getBookInfo() {
        return title + " " + author + " " + yearPublished;
    }

    public void printBookDetails() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год публикации: " + yearPublished);
    }
}

class PrintedBook extends Book {
    private int numberOfPages;
    private String publisher;
    private double price;

    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, String publisher, double price) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.price = price;
    }

    @Override
    public String getBookInfo() {
        return title + " " + author + ", " + yearPublished + " - " + numberOfPages + " стр \n" + publisher + ", $" + price;
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails(); // Забылось, но вроде работает :)
        System.out.println("Издательство: " + publisher);
        System.out.println("Количество страниц: " + numberOfPages);
        System.out.println("Цена: $" + price);
    }

    public void bookType() {
        System.out.println("Тип: Печатная книга");
    }

    public void printBook() {
        System.out.println("Эта книга будет напечатана...");
    }
}


class EBook extends Book {
    private double fileSizeMB;
    private String fileFormat;
    private double price;

    public EBook(String title, String author, int yearPublished, double fileSizeMB, String fileFormat, double price) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
        this.price = price;
    }

    @Override
    public String getBookInfo() {
        return title + " (" + author + ", " + yearPublished + ") - " + fileSizeMB + "MB, формат: " + fileFormat + ", $" + price;
    }

    @Override
    public void printBookDetails() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год публикации: " + yearPublished);
        System.out.println("Формат: " + fileFormat);
        System.out.println("Размер файла: " + fileSizeMB + "MB");
        System.out.println("Цена: $" + price);
    }

    public void bookType() {
        System.out.println("Тип: Электронная книга");
    }
}


public class Main {
    public static void main(String[] args) {
        PrintedBook pb = new PrintedBook("Гарри Поттер", "Дж. Роулинг", 1997, 320, "Bloomsbury", 20.5);
        EBook eb = new EBook("Война и мир", "Л. Толстой", 1869, 3.2, "PDF", 7.99);


        pb.printBookDetails();
        pb.bookType();
        pb.printBook();

        System.out.println("\n---\n");


        eb.printBookDetails();
        eb.bookType();
    }
}

