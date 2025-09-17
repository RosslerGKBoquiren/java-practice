package languageFamilies;

public class LanguageFamily {

    public static void main(String[] args){
        Language filipino = new Language("Tagalog", 100, "South East Asia", "verb-object-subject");
        Mayan maya = new Mayan("Mesoamerica", 600);
        SinoTibetan himalayan = new SinoTibetan("Sinitic Chinese", 1300);

        filipino.getInfo();
        maya.getInfo();
        himalayan.getInfo();
    }
}
