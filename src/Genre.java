import java.util.Arrays;

public class Genre {
    private enum genreEnum { Поп(1), Рэп(2), Рок(3), Классика(4), Джаз(5), Блюз(6), Шансон(7), Электронная(8);
        public final int value;

        genreEnum(final int value) {
            this.value = value;
        }
    }

    String getEnum() {
        return Arrays.toString(genreEnum.values());
    }

    public static String getNameByCode(int code){
        for(genreEnum e : genreEnum.values()){
            if(code == e.value) return e.name();
        }
        return null;
    }
}
