package lib.Console;

import java.util.Arrays;

public class Write {

    String prifixGolbal = "";
    String sufixGlobal = "";

    public void setPrifix(String prifix) { this.prifixGolbal = prifix; }
    public void setSufix(String sufix) { this.sufixGlobal = sufix; }

    public void arrayInt1(int[] array) {

        System.out.println(prifixGolbal + Arrays.toString(array) + sufixGlobal);

    }

    public void arrayInt2(int[][] array) {

        for (int index = 0; index < array[0].length; index++){

            System.out.println(prifixGolbal + Arrays.toString(array[index]) + sufixGlobal);

        }

    }

    public void arrayDouble1(double[] array) {

        System.out.println(prifixGolbal + Arrays.toString(array) + sufixGlobal);

    }

    public void arrayDouble2(double[][] array) {

        for (int index = 0; index < array[0].length; index++){

            System.out.println(prifixGolbal + Arrays.toString(array[index]) + sufixGlobal);

        }

    }

    public void arrayFloate1(float[] array) {

        System.out.println(prifixGolbal + Arrays.toString(array) + sufixGlobal);

    }

    public void arrayFloat2(float[][] array) {

        for (int index = 0; index < array[0].length; index++){

            System.out.println(prifixGolbal + Arrays.toString(array[index]) + sufixGlobal);

        }

    }

    public void arrayStringe1(String[] array) {

        System.out.println(prifixGolbal + Arrays.toString(array) + sufixGlobal);

    }

    public void arrayString2(float[][] array) {

        for (int index = 0; index < array[0].length; index++){

            System.out.println(prifixGolbal + Arrays.toString(array[index]) + sufixGlobal);

        }

    }

    public void arrayBoolean1(boolean[] array) {

        System.out.println(prifixGolbal + Arrays.toString(array) + sufixGlobal);

    }

    public void arrayBoolean2(boolean[][] array) {

        for (int index = 0; index < array[0].length; index++){

            System.out.println(prifixGolbal + Arrays.toString(array[index]) + sufixGlobal);

        }

    }

    public void arrayLong1(long[] array) {

        System.out.println(prifixGolbal + Arrays.toString(array) + sufixGlobal);

    }

    public void arrayLong2(long[][] array) {

        for (int index = 0; index < array[0].length; index++){

            System.out.println(prifixGolbal + Arrays.toString(array[index]) + sufixGlobal);

        }

    }

    public void arrayChar1(char[] array) {

        System.out.println(prifixGolbal + Arrays.toString(array) + sufixGlobal);

    }

    public void arrayChar2(char[][] array) {

        for (int index = 0; index < array[0].length; index++){

            System.out.println(prifixGolbal + Arrays.toString(array[index]) + sufixGlobal);

        }

    }

    public void arrayShort1(short[] array) {

        System.out.println(prifixGolbal + Arrays.toString(array) + sufixGlobal);

    }

    public void arrayShort2(short[][] array) {

        for (int index = 0; index < array[0].length; index++){

            System.out.println(prifixGolbal + Arrays.toString(array[index]) + sufixGlobal);

        }

    }

    public void arrayByte1(byte[] array) {

        System.out.println(prifixGolbal + Arrays.toString(array) + sufixGlobal);

    }

    public void arrayByte2(byte[][] array) {

        for (int index = 0; index < array[0].length; index++){

            System.out.println(prifixGolbal + Arrays.toString(array[index]) + sufixGlobal);

        }

    }

    public void emtyln(int count) {

        for (int c = 0; c < count; c++) {

            System.out.println();

        }
    }
}
