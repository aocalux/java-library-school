import lib.Console.Write;
import lib.Math.Random;
import lib.Console.Read;

public class Main {

    public static void main(String[] args) {

        int[] hallo = {1,2,3};
        int[][] d2 = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};

        Write write = new Write();
        Random rnd = new Random();
        Read read = new Read();

        write.setPrifix("Präfix ");
        write.setSufix(" Sufix");

        write.arrayInt1(hallo);
        write.emtyln(2);
        write.arrayInt2(d2);

        System.out.println(rnd.rndInt(0,1));

        System.out.print("Input: ");
        String in = read.nextLine("error");
        System.out.println(in);

    }
}