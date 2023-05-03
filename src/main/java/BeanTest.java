import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {

        Album albumOne = new Album(1, "boygenius", "the record", 2023, 2.3, "Indie Rock");

        Album albumTwo = new Album(2, "Hamish Hawk", "Angel Numbers", 2023, 1.8, "Indie Rock");

        Album albumThree = new Album(3,"Mork", "Dypet", 2023, 1.4,"Melodic Black Metal");

        ArrayList<Album> albumList = new ArrayList<>();

        albumList.add(albumOne);
        albumList.add(albumTwo);
        albumList.add(albumThree);

        for ( Album album : albumList){
            System.out.println(album.toString());
        }

        System.out.println();

        Author authorOne = new Author(1,"Lloyd", "Alexander");
        Author authorTwo = new Author(2, "Terry", "Pratchett");

        ArrayList<Author> authorList = new ArrayList<>();

        authorList.add(authorOne);
        authorList.add(authorTwo);

        for (Author author : authorList){
            System.out.println(author.toString());
        }

        System.out.println();

        Quotes quoteOne = new Quotes(1, authorOne,"Fantasy is hardly an escape from reality. It's a way of understanding it.");
        Quotes quoteTwo = new Quotes(2, authorTwo,"Stories of imagination tend to upset those without one.");

        ArrayList<Quotes> quotes = new ArrayList<>();

        quotes.add(quoteOne);
        quotes.add(quoteTwo);

        for (Quotes quote : quotes){
            System.out.println(quote.toString());
        }
    }
}
