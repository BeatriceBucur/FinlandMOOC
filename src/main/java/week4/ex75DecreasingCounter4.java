package week4;

public class ex75DecreasingCounter4 {
    /*
    
     */
    private int value;   // object variable that remembers the value of the counter
    private int valueInitial;


    public ex75DecreasingCounter4(int valueAtStart) {
        this.value = valueAtStart;
        this.valueInitial = valueAtStart;
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

    public void setInitial(){
         this.value = this.valueInitial;
        }


    public static void main(String[] args) {
        ex75DecreasingCounter4 counter = new ex75DecreasingCounter4(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
