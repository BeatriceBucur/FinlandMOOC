package week4;

public class ex75DecreasingCounter {
    /*

     */


        private int value;   // object variable that remembers the value of the counter


        public ex75DecreasingCounter(int valueAtStart) {
            this.value = valueAtStart;
        }

        public void printValue() {
            System.out.println("value: " + this.value);
        }

        public void decrease() {
            // write here the code that decrements the value of counter by one
            if(this.value>0){
                value--;
            }
        }

        // and here the rest of the methods

            public static void main(String[] args) {
                ex75DecreasingCounter counter = new ex75DecreasingCounter(10);

                counter.printValue();

                counter.decrease();
                counter.printValue();

                counter.decrease();
                counter.printValue();
            }
    }

