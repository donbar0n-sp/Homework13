import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    private int publishedYear;

    public Book(String bookName, Author authorName, int publishedYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String toString() {
        return "The Book " + this.bookName + " was written by " + this.authorName + " and published in " + this.publishedYear;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Book otherBook = (Book) other;
        return bookName.equals(otherBook.bookName) &&
                authorName.equals(otherBook.authorName) &&
                publishedYear == otherBook.publishedYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, publishedYear);
    }
}
