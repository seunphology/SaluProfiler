public class Incremental { // this class is run by the UseCounter.java class created separatedly.

    public Incremental() {
        counter = 1;
    }

    public Incremental(int startValue){

        counter = startValue;
    }

    public int nextValue(){

        int temp = counter;

        counter++;
        return temp;
    }

    private int counter; // what happens tif we add static to this instance variable?it becomes a class variable and count1 and count2 will be same when we run this class with UseCounter
}
