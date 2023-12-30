package lib.Console;

import java.util.Scanner;

public class Read {

    Scanner console = new Scanner(System.in);

    public int nextInt(String error) {

        int next;

        while (true){

            try{

                next = console.nextInt();
                break;

            } catch (Exception e){

                System.out.println(error);
                console.next();

            }
        }
        return next;
    }

    public byte nextByte(String error) {

        byte next;

        while (true){

            try{

                next = console.nextByte();
                break;

            } catch (Exception e){

                System.out.println(error);
                console.next();

            }
        }
        return next;
    }

    public short nextShort(String error) {

        short next;

        while (true){

            try{

                next = console.nextShort();
                break;

            } catch (Exception e){

                System.out.println(error);
                console.next();

            }
        }
        return next;
    }

    public long nextLong(String error) {

        long next;

        while (true){

            try{

                next = console.nextLong();
                break;

            } catch (Exception e){

                System.out.println(error);
                console.next();

            }
        }
        return next;
    }

    public float nextFloat(String error) {

        float next;

        while (true){

            try{

                next = console.nextFloat();
                break;

            } catch (Exception e){

                System.out.println(error);
                console.next();

            }
        }
        return next;
    }

    public double nextDouble(String error) {

        double next;

        while (true){

            try{

                next = console.nextDouble();
                break;

            } catch (Exception e){

                System.out.println(error);
                console.next();

            }
        }
        return next;
    }

    public boolean nextBoolean(String error) {

        boolean next;

        while (true){

            try{

                next = console.nextBoolean();
                break;

            } catch (Exception e){

                System.out.println(error);
                console.next();

            }
        }
        return next;
    }

    public String nextLine(String error) {

        String next;

        while (true){

            try{

                next = console.nextLine();
                break;

            } catch (Exception e){

                System.out.println(error);
                console.next();

            }
        }
        return next;
    }
}
