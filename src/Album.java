import java.util.ArrayList;
import java.util.List;

public class Album{
    final public String name;
    final public int year;
    final public List<Song> songs = new ArrayList<>();

    Album(String name, int year){
        this.name = name;
        this.year = year;
    }

    void add_song(Song song){
        this.songs.add(song);
    }

    String getName() {
        return this.name;
    }

    int getYear() {
        return this.year;
    }

    int getSizeListSongs(){
        return songs.size();
    }

    Song getSong(int i){
        return songs.get(i);
    }
}
