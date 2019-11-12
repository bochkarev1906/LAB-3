import java.util.ArrayList;
import java.util.List;

public class Collections {
    final private List<Song> collection = new ArrayList<>();

    void add_song(Song song){
        this.collection.add(song);
    }

    String get_collection(){
        String str = "";
        for (int i = 0; i < this.collection.size(); i++){
            str += this.collection.get(i).getName();
            if (i == this.collection.size() - 1){
                str += ".";
            }
            else{
                str += ", ";
            }
        }
        return str;
    }
}
