import acm.program.ConsoleProgram;

/**

*/

public class UnilagS extends ConsoleProgram {

    public void run (){
        setFont("Times New Roman = 20");

        Student stud = new Student("Salu Oluwaseun", 3121486);
        stud.setUnits(179);

        println(stud.getName() + " has earned " + stud.getUnits() + " Units ");

        println(stud.getName() + " can graduate: " + stud.hasEnoughUnits());

        println(stud.getName() + " takes Advanced Climatology ");
        stud.incrementalUnits(9);

        println(stud.getName() + " can graduate: " + stud.hasEnoughUnits());

        if (stud.hasEnoughUnits()){
            println(" Congratulations dear alumnus/alumna " + stud.toString());
        }


    }



}
