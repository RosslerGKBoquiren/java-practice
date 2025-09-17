package review;

class Mayan extends Language {

    public Mayan(String inputName, int inputNumSpeakers) {
        super(inputName, inputNumSpeakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Fun fact: Mayan languages are known for their complex glottal stops." + "\n");
    }

}
