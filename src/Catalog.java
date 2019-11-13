import java.util.ArrayList;
import java.util.List;

public class Catalog {
    final private List<Artist> artists = new ArrayList<>();
    final private List<Collections> collections = new ArrayList<>();

    public void add_artist (Artist art){
        this.artists.add(art);
    }

    public void add_collection (Collections collect){
        this.collections.add(collect);
    }

    String searchArtistByGenre(String genre) {
        String str = "";
        for (int i = 0; i < this.artists.size(); i++) {
            if (genre.equals(artists.get(i).getGenre())) {
                str += "[";
                str += this.artists.get(i).getName();
                str += "] ";
            }
        }
        return str;
    }

    String search_album_by_genre(String genre) {
        String str = "";
        for (int i = 0; i < this.artists.size(); i++) {
            if (genre.equals(artists.get(i).getGenre())) {
                for (int j = 0; j < this.artists.get(i).getSizeListSongs(); j++) {
                    str += "[";
                    str += this.artists.get(i).getAlbum(j).getName();
                    str += "] ";
                }
            }
        }
        return str;
    }

    String search_song_by_year(int year) {
        String str = "";
        for (int i = 0; i < this.artists.size(); i++) {
            for (int j = 0; j < this.artists.get(i).getSizeListSongs(); j++) {
                if (year == artists.get(i).getAlbum(j).getYear()){
                    for (int k = 0; k < this.artists.get(i).getAlbum(j).getSizeListSongs(); k++) {
                        str += "[";
                        str += this.artists.get(i).getAlbum(j).getSong(k).getName();
                        str += "] ";
                    }
                }
            }
        }
        return str;
    }


    void get_catalog(){
        for (int i = 0; i < artists.size(); i++){
            System.out.println(artists.get(i).name);
            for (int j = 0; j < artists.get(i).albums.size(); j++) {
                System.out.print(j + 1 + ") " + artists.get(i).albums.get(j).name + "(" + artists.get(i).albums.get(j).year + "): ");
                for (int k = 0; k < artists.get(i).albums.get(j).songs.size(); k++) {
                    System.out.print("\"" + artists.get(i).albums.get(j).songs.get(k).name + "\"");
                    if (k == artists.get(i).albums.get(j).songs.size() - 1){
                        System.out.print(".");
                    }
                    else{
                        System.out.print(", ");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
