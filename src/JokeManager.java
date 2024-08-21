import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;


    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    public void addJoke(String joke){
        jokes.add(joke);
    }
    public String drawJokes(){
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        }
    }
    public void printJokes(){
        int count = 0;
        for(String joke: jokes){
            count++;
            System.out.println(count + ": "+ joke);
        }
    }

}
