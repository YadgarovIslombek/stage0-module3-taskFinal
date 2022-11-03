package lang.print.gaps.finalModuleTask;



public class NumberReverter {
    public void revert(int number) {
        //946
        int a = number%10;
        int b = number/10%10;
        int c = number/100;
        System.out.println((a*100)+(b*10)+c);
    }


}
