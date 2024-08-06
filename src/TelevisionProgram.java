public class TelevisionProgram{
   private String name;
   private int duration;

   public TelevisionProgram(String name, int duration){
       this.name = name;
       this.duration = duration;
   }
   public String toString(){
       return name+", " + duration + " minutes" ;
   }
    public int getDuration(){
       return this.duration;
    }
}