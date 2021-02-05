public class Rank extends Student {
    private String rank;

    //Initialization constructor
    public Rank (String nameStudent, String houseStudent, int levelStudent, String rank){
        super(nameStudent, houseStudent, levelStudent);
        this.rank = rank;
    }

    public String wiki(){
        String str = super.wiki() + " - RANK : " + this.rank;
        return str;
    }

    public String getrank() {
        return rank;
    }

    //Define the level
    public void setrank(String rank) {
        this.rank = rank;
    }
}