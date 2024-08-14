public class Books {
    private int year;
    private String name;


    public Books(String name, int year){
        this.year = year;
        this.name =name;

    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Books)){
            return false;
        }

        Books comparedBooks = (Books) compared;

        if(this.name.equals(comparedBooks.name) && this.year == comparedBooks.year){
            return true;
        }
        return false;
    }
}
