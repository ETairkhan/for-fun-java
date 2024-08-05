public class Statistics{
    private int count;
    private int sum;
    private int evenNumber;
    private int oddNumber;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        count += 1;
        sum+= number;
        if (number % 2 == 0){
            evenNumber +=number;
        }else {
            oddNumber +=number;
        }
    }

    public int getCount() {
        return count;
    }
    public int sum(){
        return sum;
    }
    public int evenSum(){
        return evenNumber;
    }
    public int oddSum(){
        return oddNumber;
    }
    public double average(){
        return (double) sum/count;
    }
}