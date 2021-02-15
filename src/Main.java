public class Main{
 
    public static void main(String[] args){
        //Define a blank array
        Student [] tableau = new Student[6];

        //Define an array of data
        String[] tab = {"Harry Potter", "Ron Weasley", "Hermione Granger", "Draco Malefoy", "Cho Chang", "Hannah Abbott"};
        String[] tab2 = {"Gryffindor", "Gryffindor", "Gryffindor", "Slytherin", "Ravenclaw", "Hufflepuff"};
        int[] tab3 = {3, 2, 4, 3, 5, 1};

        for(int i = 0; i < 6; i++){
            //Students with level <4 do not have rank
            if (tab3[i] < 4){
                Student s = new Student(tab[i], tab2[i], tab3[i]);
                tableau[i] = s;
            }

            //Students with level>=4 have super-wizard rank
            else{
                Rank r = new Rank (tab[i], tab2[i], tab3[i], "super-wizard");
                tableau[i] = r;
            }

        }

        //Array reading
        for(Student v : tableau){
            System.out.println(v.wiki());
        }
    }
}
