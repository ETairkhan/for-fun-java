import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private Suitcase suitcase;
    private int totalWeight;
    private int count;
    private ArrayList<Suitcase> memorySuitcase;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.memorySuitcase = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        count++;
        totalWeight += suitcase.totalWeight();
        memorySuitcase.add(suitcase);
    }
    public void printItems(){
        for(Suitcase a: memorySuitcase){
            a.printItems();
        }

    }

    public String toString(){
        return count + " suitcases" + "(" + totalWeight + " kg)";
    }
}
