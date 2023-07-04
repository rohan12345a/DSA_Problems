package DSA01;

//Q1
//Rectangle
//public class pattern {
//    public static void main(String[] args) {
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }
//    }
//}

//hollow rectangle:

//public class pattern {
//    static int m=5;
//    static int n=4;
//    public static void main(String[] args) {
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//               //print for i 1 or j 1 or i=n or j=m
//                if(i==1 || j==1 || i==n || j==m ){
//                    System.out.print("*");
//                }
//                else
//                    System.out.print(" ");
////
//            }
//            System.out.println();
//        }
//
//    }
//}

// q3
//public class pattern {
//    public static void main(String[] args) {
//        int n=4;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//q4 oppposite pyramid

//public class pattern {
//    public static void main(String[] args) {
//        int n=4;
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

// Q5:

//public class pattern {
//    public static void main(String[] args) {
//        int n=4;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int f=1;f<=i;f++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}

// q6 print no pattern

//public class pattern {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}


// Inverted half pyramid with nos

//public class pattern {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

// Floyds Triangle:

//public class pattern {
//    public static void main(String[] args) {
//        int n=5;
//        int num=0;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                num++;
//                System.out.print(num+" ");
//            }
//            System.out.println();
//
//        }
//    }
//}


// q9  0 and 1 triangle

//public class pattern {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(i%2!=0){
//                    System.out.print(1);
//                }
//                else System.out.print(0);
//            }
//            System.out.println();
//        }
//    }
//}

public class pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else System.out.print(0);
            }
            System.out.println();
        }
    }
}


