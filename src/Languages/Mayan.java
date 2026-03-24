package Languages;

public class Mayan extends Language{

    public Mayan(String name, int numspeakers){
        super(name, numspeakers, "Central America", "verb-object-subject");
    }

    @Override
    public String getInfo(){return name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".\nThe language follows the word order: " + wordOrder + "\nFun fact: " + name + " is an ergative language.";
    }
}
