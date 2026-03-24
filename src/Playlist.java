import java.util.ArrayList;
import java.util.Arrays;

class Playlist {

    public static void main(String[] args) {

        String[] favoriteSongs = {"SveTec - Existance", "Viper XXL - Nothing Matters", "SveTec - Wouldn't You Like To Be a Ho Too",
                "SveTec - I Can Be Your Freak", "Instigator - Black Betty",
                "Ornella - Pump It Hard", "Klangkuenstler - Toter Schmetterling", "William Luck - RAWPOWER",
                "Instigator - Bass FInger", "Viper XXL - In Love With Barbara"};

        System.out.println(favoriteSongs[0]);
        System.out.println(favoriteSongs[1]);
        System.out.println(favoriteSongs[2]);

        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("BMT - Shranz Z");
        desertIslandPlaylist.add("Instigator - Cannabals");
        desertIslandPlaylist.add("Instigator - Wicked");
        desertIslandPlaylist.add("Hallen Halloween - Bandid Velho");
        desertIslandPlaylist.add("Dealema - Sala 101");

        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove(14);
        desertIslandPlaylist.remove(13);
        desertIslandPlaylist.remove(12);
        desertIslandPlaylist.remove(11);
        desertIslandPlaylist.remove(10);
        desertIslandPlaylist.remove(9);
        desertIslandPlaylist.remove(8);
        desertIslandPlaylist.remove(7);
        desertIslandPlaylist.remove(6);
        desertIslandPlaylist.remove(5);

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        int songA = desertIslandPlaylist.indexOf("BMT - Shranz Z");
        int songB = desertIslandPlaylist.indexOf("Instigator - Cannabals");
        String tempA = "BMT - Shranz Z";
        desertIslandPlaylist.set(0, desertIslandPlaylist.get(1));
        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(1,tempA);
        System.out.println(desertIslandPlaylist);

        for (int i = 0; i < desertIslandPlaylist.size() / 2; i++) {
            int indexOfLast = desertIslandPlaylist.size() - 1 - i;
            String first = desertIslandPlaylist.get(i);
            String last = desertIslandPlaylist.get(indexOfLast);
            desertIslandPlaylist.set(i, last);
            desertIslandPlaylist.set(indexOfLast, first);
        }
        System.out.println(desertIslandPlaylist);


        for (int i = 0; i < desertIslandPlaylist.size(); i++) {

            int randomIndex = (int)(Math.random() * desertIslandPlaylist.size());
            String random1 = desertIslandPlaylist.get(randomIndex);
            String random2 = desertIslandPlaylist.get(i);
            desertIslandPlaylist.set(randomIndex, random2);
            desertIslandPlaylist.set(i, random1);

        }
        System.out.println(desertIslandPlaylist);

    }

}