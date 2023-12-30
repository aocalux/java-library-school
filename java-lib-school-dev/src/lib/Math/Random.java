package lib.Math;

public class Random {

    public int rndInt(int min, int max) {

        max++;
        min++;

        int rnd = ((int)(Math.random() * (max) + (min)));

        rnd--;

        return rnd;

    }
}
