package Languages;

public class SinoTibetan extends Language{

    public SinoTibetan(String name, int numspeakers){
        super(name, numspeakers, "Asia", "subject-object-verb");
        if (this.name.contains("Chinese")) {
            setWordOrder("subject-verb-object");
        }
    }
}
