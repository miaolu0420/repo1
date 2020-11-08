public class homework5 {

    public static void main(String[] args) {

        int[] arr = {48, 49, 50,51,52,53,54,55,56,57,97,98,99,100,101,102};

        for (int i = 0; i < arr.length; i++) {

            if (0 == i) {

                System.out.print(' ');

                System.out.print(' ');

                for (int j = 0; j < arr.length; j++) {

                    System.out.print(' ');

                    System.out.print((char)arr[j]);

                    System.out.print(' ');

                }

                System.out.println();

            }

            System.out.print((char) arr[i]);

            System.out.print(' ');

            for (int j = 0; j < arr.length; j++) {

                System.out.print(" + ");

            }

            System.out.println();

                }

            }

        }