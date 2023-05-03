import java.io.Serializable;

public class Quotes implements Serializable {

    private long id;
    private Author author;
    private String content;

    public Quotes() {
    }

    public Quotes(long id, Author author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "id=" + id +
                ", author=" + author +
                ", content='" + content + '\'' +
                '}';
    }
}
