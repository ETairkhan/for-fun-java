public class Archive {
    private String Identifier;
    private String name;

    public Archive(String Identifier , String name){
        this.Identifier = Identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Archive)){
            return false;
        }

        Archive archiveCompared = (Archive) compared;

        if(this.Identifier.equals(archiveCompared.Identifier)){
            return true;
        }

        return false;
    }
}
