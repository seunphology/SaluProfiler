public class MyCounter {

    // This simple program can be used to assign ID numbers to student or as a counter in a manufacturing factory

    // now a constructor

    public MyCounter (int startValue) {

        counter= startValue; // setting the start value as that which is passed as parameter of the constructor

    }

    public MyCounter(){ // another constructor without a parameter.

        counter= 1; // setting the start value as 1 by default
    }

    //how do i get new numbers ? we need a method or methods that will do that

    public int nextValue(){ //takes no parameters because we dont need to tell the object anything to get the next value

        int temp = counter; // the current value of the counter. temp is only useful inside this method

        counter++; // adds 1 to every current value of the counter

        return temp;

    }

    // instance variables help keep track of happening between methods. helps us know what initial value is
    private int counter; // instance variable that enables us to keep track of last count each time an object calls
}


