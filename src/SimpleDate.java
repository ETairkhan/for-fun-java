public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance(int howManyDays){
        for(int i =0; i<howManyDays; i++){
            day += 1;
            if(day > 30){
                day = 1;
                month++;
                if(month>12){
                    month = 1;
                    year++;
                }
            }
        }
    }
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate afterNumberOfDays = new SimpleDate(this.day, this.month, this.year);
        afterNumberOfDays.advance(days);

        return afterNumberOfDays;
    }


    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
