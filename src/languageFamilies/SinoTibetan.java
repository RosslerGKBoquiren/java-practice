package languageFamilies;

class SinoTibetan extends Language{

    public SinoTibetan(String inputName, int inputNumSpeakers){
        super(inputName, inputNumSpeakers, "Asia", inputName.contains("Chinese") ?  "subject-verb-object" : "subject-object-verb");
    }
}
