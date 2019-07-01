package week4;

public class ex75DecreasingCounter3 {
    /*
    Exercise 75.3: Counter reset
    Implement the method public void reset() that sets the value of the counter to zero.
    Example of usage: - sample output
    value: 100
    value: 0
    value: 0
     */
    private int value;   // object variable that remembers the value of the counter


    public ex75DecreasingCounter3(int valueAtStart) {
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

    public void reset(){
        if(this.value>0) {
            value = 0;
        }
    }


        public static void main(String[] args) {
            ex75DecreasingCounter3 counter = new ex75DecreasingCounter3(100);

            counter.printValue();

            counter.reset();
            counter.printValue();

            counter.decrease();
            counter.printValue();
        }
    }

