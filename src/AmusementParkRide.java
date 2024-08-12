public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    private int visitors;

    //Alt + Insert ( you can get a setters and getters automatically)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLowestHeight() {
        return lowestHeight;
    }

    public void setLowestHeight(int lowestHeight) {
        this.lowestHeight = lowestHeight;
    }

    public int getVisitors() {
        return visitors;
    }

    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }

    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
    }

    public boolean allowedToRide(Person person) {
        if (person.getHeight() < this.lowestHeight) {
            return false;
        }

        this.visitors++;
        return true;
    }


    public String toString() {
        return this.name + ", minimum height: " + this.lowestHeight +
                ", visitors: " + this.visitors;
    }
}