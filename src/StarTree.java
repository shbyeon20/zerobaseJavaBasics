public class StarTree {
    public static void main(String[] args) {
        threebythree();
        System.out.println();

        incremental();
        System.out.println();

        decremental();
        System.out.println();

        tree();
        System.out.println();

        diamond();
        }

    private static void diamond() {
        for (int i = 0 ; i<2 ;i++){
            for (int j = 0 ; j<2-i ;j++){
                System.out.print(" ");
            }

            for (int j = 0 ; j<2*i+1 ;j++){
                System.out.print("*");
            }

            for (int j = 0 ; j<2-i ;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0 ; i<1 ;i++){
            for (int j = 0 ; j<2-i ;j++){
                System.out.print(" ");
            }

            for (int j = 0 ; j<0*i+1 ;j++){
                System.out.print("*");
            }

            for (int j = 0 ; j<2-i ;j++){
                System.out.print(" ");
            }
            System.out.println();
        }


    }

    private static void tree() {
        for (int i = 0 ; i<3 ;i++){
            for (int j = 0 ; j<2-i ;j++){
                System.out.print(" ");
            }

            for (int j = 0 ; j<2*i+1 ;j++){
                System.out.print("*");
            }

            for (int j = 0 ; j<2-i ;j++){
                System.out.print(" ");
            }

            System.out.println();
        }


    }

    private static void decremental() {
        for (int i = 0 ; i<3 ;i++){
            for (int j = 0 ; j<2-i ;j++){
                System.out.print(" ");
            }

            for (int j = 0 ; j<i+1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void incremental() {
        for (int i = 0 ; i<3 ;i++){
            for (int j = 0 ; j<i+1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void threebythree() {
        for (int i = 0 ; i<3 ;i++){
            for (int j = 0 ; j<3 ;j++){
                System.out.print("*");
            }
            System.out.println();
    }
}
}
