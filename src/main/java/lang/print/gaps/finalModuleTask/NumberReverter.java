package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int num1 = number % 10;
//        System.out.println(num1);
        int num2 = ((number - num1) / 10) % 10;
//        System.out.println(num2);
        int num3 = number / 100;
//        System.out.println(num3);
        int revertNumber = num1 * 100 + num2 * 10 + num3;
        System.out.println(revertNumber);
    }

    public static void main(String[] args) {
        NumberReverter nr = new NumberReverter();
        nr.revert(389);
    }
}
