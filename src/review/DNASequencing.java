package review;

public class DNASequencing {

    private String DNA;

    public String getDNA() {
        return DNA;
    }

    public void setDNA(String DNA) {
        this.DNA = DNA;
    }

    public void checkStartCodon(String startCodon){

        if(DNA.contains(startCodon)) {
            System.out.println("Start codon found!");
        } else {
            System.out.println("No start codon.");
        }
    }

    public void checkStopCodon(String stopCodon){

        if(DNA.contains(stopCodon)) {
            System.out.println("Stop codon found!");
        } else {
            System.out.println("No Stop Codon.");
        }
    }

    public String extractGene(String startCodon, String stopCodon){
        int indexOfStartCodon = DNA.indexOf(startCodon);
        int indexOfStopCodon = DNA.indexOf(stopCodon);

        return DNA.substring(indexOfStartCodon, indexOfStopCodon + 3);
    }

    public void validateGene(String extractedGene){
        if(extractedGene.length() % 3 == 0){
            System.out.println("Extracted Gene Verification: VALID!");
        } else {
            System.out.println("Extracted Gene Verification: INVALID!");
        }
    }
}
