package review;

public class MultiplicationTable {

    private int number;

    public MultiplicationTable(int number){
        this.number = number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public String printTable(int numberOfMultiplications){
        if(numberOfMultiplications < 0){
            return "Cannot be negative.";
        }
        StringBuilder table = new StringBuilder();
        for(int i = 1; i <= numberOfMultiplications; i++){
            table.append(this.number)
                    .append(" x ")
                    .append(i)
                    .append(" = ")
                    .append(this.number * i)
                    .append("\n");
        }
        return table.toString();
    }
}
