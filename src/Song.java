public class Song {
    private String name;
    private String whoWrote;
    private int time;

    public Song(String name,String whoWrote, int time){
        this.name =name;
        this.time = time;
        this.whoWrote =whoWrote;
    }

    public boolean equals(Object compared){
      if(this == compared){
          return true;
      }
      if(!(compared instanceof Song)){
          return false;
        }
      Song comparedSong = (Song) compared;

      if (this.name.equals(comparedSong.name)&&this.whoWrote.equals(comparedSong.whoWrote)
              &&this.time == comparedSong.time){
          return true;
      }

      return false;
    }
}
