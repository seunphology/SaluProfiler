import acm.program.ConsoleProgram;

public class UseCounter extends ConsoleProgram {

    /*when adding an external library(after downloading on system) to a new project,click file-project structure
    and then find the add button at the right hand side of the screen towards the bottom ,click and find the external
    library in ur downloads file,click OK.Come back to the project,the library is already there.right click on the library
    and click on add to library.End.
     */
    public void run (){

        setFont("Times New Roman = 20");

        Incremental count1 = new Incremental(); // begins counting from 1 (the constructor with no parameter/argument

        Incremental count2 = new Incremental(1000); // starts counting from 1000 (int startValue)

        println("Five values for count 1 ");

        countFiveTimes(count1); // count1 here is not a copy(as is in integer and double),but a reference (an object itself)

        println("Five values of count 2 ");

        countFiveTimes(count2);

        println("Another five values for count 1");

        countFiveTimes(count1); //count1 here is not a copy of count1 above but an object itself and hence a reference.

        // we can go on and on inserting the 2 objects/references we have and keep passing them tru countFiveTimes method and coming back to println them.
// we always know where objects live. We never really can trace variables..so we dont do this with them,better to change names.

    }

    //when you pass object as a parameter,unlike interger or double (where its a copy you are passing),you are passing a reference
 private void countFiveTimes(Incremental counter){ // pass object through a method,loops tru 5 times and prints next 5 values
      for (int i=0; i<5; i++){
          println(counter.nextValue());
     }

 }
}
