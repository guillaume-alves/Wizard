public class Student{
    protected String nameStudent;
    protected String houseStudent;
    protected int levelStudent;
    protected int points;

    //Default constructor
    public Student(String nameStudent, String houseStudent, int levelStudent){
        System.out.println("A new Student is arrived at Hogwarts !");
        this.nameStudent = nameStudent;
        this.houseStudent = houseStudent;
        this.levelStudent = levelStudent;
        this.setPoints();
    }

    public String getName()  {
        return nameStudent;
    }

    public String getHouse() {
        return houseStudent;
    }

    public int getLevel() {
        return levelStudent;
    }

    public void setName(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setHouse(String houseStudent) {
        this.houseStudent = houseStudent;
    }

    public void setLevel(int levelStudent) {
        this.levelStudent = levelStudent;
    }

    private void setPoints() {
        int niveau[] = {1, 2, 3, 4, 5};
        int points[] = {100, 50, 20, 10, 5};

        int i = 0;
        for (i=0; i < niveau.length && this.levelStudent != niveau[i];i++);
        this.points = points[i];
    }

    //Return description of student
    public String wiki(){
        return "\t NAME : "+this.nameStudent+" - HOUSE : "+this.houseStudent+ " - LEVEL : "+this.levelStudent;
    }
}
