import java.util.ArrayList;

public class Suitcase {
    private int weight;
    private int maxWeight;
    private int totalWeight;
    private int totalItems;
    private ArrayList<Item> items;

    public Suitcase( int maxWeight){
        this.weight = 0;
        this.totalWeight = 0;
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        weight = weight  + item.getWeight();
        if(weight < maxWeight){
            this.items.add(item);
            totalWeight = totalWeight + item.getWeight();
            totalItems++;
        }

    }
    public String toString(){
        if (totalItems == 0){
            return "no items (0 kg)";

        }
        if ( totalItems == 1){
            return "1 item (" +totalWeight + " kg)";
        }
        return totalItems + " items (" + totalWeight+" kg)";
    }
    //ALL ITEMS FOR THE SUIT CASE CLASS


}
