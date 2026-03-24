package Languages;

public class Language{
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public String getInfo(){
        return name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".\nThe language follows the word order: " + wordOrder;
    }
    protected void setWordOrder(String wordOrder){
        this.wordOrder = wordOrder;
    }


    public static void main(String[] args){

        Language portuguese = new Language("Portugues", 1000000, "Portugal, Brasil, Africa", "subject-verb-object");
        System.out.println(portuguese.getInfo());
        Language Achi = new Mayan("ACHI", 12000);
        System.out.println(Achi.getInfo());
        Language mandarinChinese = new SinoTibetan("Mandarin Chinese", 500000);
        Language burmese = new SinoTibetan("Burmese", 400000);
        System.out.println(mandarinChinese.getInfo());
        System.out.println(burmese.getInfo());
    }
}