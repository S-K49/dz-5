public class SecondFile {

    int number = 5;

    public int printNumber() {
        System.out.format("---<Value of the number is %d>---", number);
        return number;
    }

    // OR SIMPLY

    public void printNumberTwo() {
        System.out.format("\n---<Value of the number is %d>---", number);
    }
}
