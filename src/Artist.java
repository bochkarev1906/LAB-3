import java.util.ArrayList;
import java.util.List;

public class Artist{
    final public String name;
    final public String genre;
    final public List<Album> albums = new ArrayList<>();

    Artist(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    void addAlbum(Album album){
        this.albums.add(album);
    }

    public String getArtist(){
        return this.name + " " + this.albums.get(0).getName() + " " + this.albums.get(0).getSong(0).getName();
    }

    String getName() {
        return this.name;
    }

    String getGenre() {
        return this.genre;
    }

    int getSizeListSongs(){
        return albums.size();
    }

    Album getAlbum(int i){
        return albums.get(i);
    }
}
