package lang.print.gaps.finalModuleTask;



public class NumberReverter {
    public void revert(int number) {
        //946
        int a = number%10;    //6 ni
        int b = number/10%10; //4 ni
        int c = number/100; //9 ni
        System.out.println((a*100)+(b*10)+c);
    }


}
