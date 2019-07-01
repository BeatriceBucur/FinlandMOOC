package week4;

public class ex75DecreasingCounter2 {
    /*
    Exercise 75.2: Value remains positive
    Change your implementation of the method decrease() so that the value of the counter
    will not drop below zero.
    If the method is called when the value is zero, nothing should happen - output should be:
    value: 2
    value: 1
    value: 0
    value: 0

     */
    private int value;   // object variable that remembers the value of the counter


    public ex75DecreasingCounter2(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here the code that decrements the value of counter by one
        if(this.value>0){
            value--;
        }else{
            value=0;
        }
    }

    // and here the rest of the methods

    public static void main(String[] args) {
        ex75DecreasingCounter2 counter = new ex75DecreasingCounter2(2);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}




