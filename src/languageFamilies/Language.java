package languageFamilies;

public class Language {

    String name;
    int numSpeakers;
    String regionsSpoken;
    String wordOrder;

    public Language(String inputName, int inputNumSpeakers, String inputRegionsSpoken, String inputWordOrder){
        name = inputName;
        numSpeakers = inputNumSpeakers;
        regionsSpoken =inputRegionsSpoken;
        wordOrder = inputWordOrder;
    }

    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + "." + "\n" + "The language follows the word order: " + wordOrder + "\n");
    }
}
