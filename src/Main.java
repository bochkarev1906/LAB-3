import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        List<Artist> artists = new ArrayList<>();
        Genre genre = new Genre();
        System.out.println(genre.getEnum());
        Artist art1 = new Artist("T-Fest", genre.getNameByCode(1));
        System.out.println(art1.getGenre());
        Album alb1 = new Album("ИНОСТРАНЕЦ", 2018);
        Album alb2 = new Album("УЛЕТИ", 2017);
        Album alb3 = new Album("МИМО СТАРЫХ ДОМОВ", 2016);
        art1.addAlbum(alb1);
        art1.addAlbum(alb2);
        art1.addAlbum(alb3);
        Song son1 = new Song("Иностранец");
        Song son11 = new Song("Все в моем доме есть");
        alb1.add_song(son1);
        alb1.add_song(son11);
        Song son2 = new Song("Улети");
        alb2.add_song(son2);
        Song son3 = new Song("Мимо старых домов");
        alb3.add_song(son3);
        artists.add(art1);
        Catalog cat1 = new Catalog();
        cat1.add_artist(art1);

        Artist art2 = new Artist("Мияги & Эндшпиль", "Рэп");
        Album album1 = new Album("I GOT LOVE", 2017);
        Album album2 = new Album("HAJIME 2", 2017);
        Album album3 = new Album("HAJIME 1", 2016);
        art2.addAlbum(album1);
        art2.addAlbum(album2);
        art2.addAlbum(album3);
        Song song1 = new Song("I got love");
        album1.add_song(song1);
        Song song2 = new Song("Самая");
        album2.add_song(song2);
        Song song3 = new Song("Рапапам");
        album3.add_song(song3);
        artists.add(art2);
        cat1.add_artist(art2);
        //cat1.get_catalog();

        Collections collect = new Collections();
        collect.add_song(song1);
        collect.add_song(son1);
        System.out.println(collect.get_collection());

        cat1.add_collection(collect);

        System.out.println(cat1.searchArtistByGenre("Поп"));
        System.out.println(cat1.search_album_by_genre("Поп"));
        System.out.println(cat1.search_song_by_year(2018));
    }
}