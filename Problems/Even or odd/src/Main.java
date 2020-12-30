import java.util.Scanner;

class Main {
    public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);
       int i;

            while (scn.hasNext()) {
                i = scn.nextInt();
                 if (i == 0) {
                    break;
                }
                if (i % 2 != 0) {
                    System.out.println("odd");
                } else {
                    System.out.println("even");
                }
               
            }
        }
    }
