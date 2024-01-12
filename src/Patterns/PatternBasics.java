package src.Patterns;

public class PatternBasics {
    public static void main(String[] args) {
        spiralDummy(5);
    }

    static void square(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void ratQ1(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=j) System.out.print("*");
                else break;
            }
            System.out.println();
        }
    }

    static void ratQ1NumIncre(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                if (i>=j) System.out.print(j);
                else break;
            }
            System.out.println();
        }
    }

    static void ratQ1NumSameInEachRow(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                if (i>=j) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void ratQ4(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (i<=n-1-j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    static void ratQ4Num(int n){
        for (int i = 0; i < n ; i++) {
            int num = 1;
            for (int j = 0; j < n; j++) {
                if (i<=n-1-j) System.out.print(num++);
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    static void upperPyramid(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 2*n; j++) {
                if (j>=n-i-1 && j<=n+i-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    static void lowerPyramid(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 2*n; j++) {
                if (j>=i && j<=n+1-i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    static void rhombus(int n){
        if(n%2==0) n=n+1;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if(i<=n/2) {
                    if (j >= n/2 -i && j <= n/2+i) System.out.print("*");
                    else System.out.print(" ");
                }
                else {
                    if (j >= i-n/2 && j <= 3*n/2-i-1) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    static void myRhombus(int n){
        int spaces = n/2, stars = 1;
        for(int i = 0;i <= n/2;i++ ) {
            for (int j = 0; j < spaces; j++)
                System.out.print(" ");
            for (int j = 0; j < stars; j++)
                System.out.print("*");
            spaces--;
            stars += 2;
            System.out.println();
        }
        spaces+=2;
        stars-=4;
        for(int i = n/2+1;i <= n;i++ ) {
            for (int j = 0; j < spaces; j++)
                System.out.print(" ");
            for (int j = 0; j < stars; j++)
                System.out.print("*");
            spaces++;
            stars -= 2;
            System.out.println();
        }
    }


    static void rightRhombus (int n){
        int stars = 1,spaces=n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stars; j++) {
                if(i<n) System.out.print("*");
            }
            stars++;
            System.out.println();
        }
        for (int i = n; i < 2*n-1; i++) {
            for (int j = 0; j <spaces; j++) {
                System.out.print("*");
            }
            spaces--;
            System.out.println();
        }
    }

    static void patt1010(int n){
        int start ;
        for (int i = 0; i < n; i++) {
            if(i%2==0) start =1;
            else start=0;
            for (int j = 0; j <=i; j++) {
                System.out.print(start);
                start = 1 -start;
            }
            System.out.println(" ");
        }
    }

    static void ratAndLatNumIncre(int n){
        for (int i = 1; i <=n; i++) {
            int num =i;
            for (int j = 1; j<=2*n; j++) {
                if (j<=i) System.out.print(j);
                else if (j>=2*n-i+1) System.out.print(num--);
                else System.out.print(" ");
            }

            System.out.println();
        }
    }

    static void ratNum1234incre(int n){
        int num = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j<=i) System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    static void ratQ1ABCD(int n){
        for (int i = 0; i <n ; i++) {
            int a = 65;
            for (int j = 0; j <n ; j++) {
                if(j<=i) System.out.print((char) a++);
            }
            System.out.println();
        }
    }

    static void ratQ4ABCD(int n){
        for (int i = 0; i <n ; i++) {
            int a = 65;
            for (int j = 0; j <n ; j++) {
                if(j<=n-1-i) System.out.print((char) a++);
            }
            System.out.println();
        }
    }

    static void ratQ1ABCDSameInEachRow(int n){
        int a = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if(j<=i) System.out.print((char) a);
            }
            a++;
            System.out.println();
        }
    }

    static void ratQ1EDCBADecre(int n){
        int e = 64+n;
        for (int i = 0; i <n ; i++) {
            int eDup=e;
            for (int j = 0; j < n; j++) {
                if (j<=i) System.out.print((char) eDup++);
            }
            e--;
            System.out.println();
        }
    }

    static void middleHollowRhombus(int n){
        if (n%2!=0) n=n+1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if(i<n/2 && j<=n/2-1-i || i<n/2 && j>=i+n/2) System.out.print("*");
                else if (i>=n/2 && j<=i-n/2 || i>=n/2 && j>=3*n/2-1-i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void butterfly(int n){
        if (n%2==0) n=n+1;
        for (int i = 0; i < 2*n; i++) {
            for (int j = 0; j < 2*n; j++) {
                if(i<n) {
                    if (j <= i||j>=2*n-i-1) System.out.print("*");
                    else System.out.print(" ");
                }
                else{
                    if (j<2*n-i-1||j>i) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void spiral(int n){
        int start = 0,end = 2*n-1;
        int num=n;
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                if (i==start||i==end||j==start||j==end) System.out.print(num);
            }
            System.out.println();
            start++;
            end--;
            num--;
        }
    }

    static void spiralDummy(int n){
        for (int i = 0; i < 2*n-1; i++) {
            int num=n,x=i;
            if(i>=n)
                i=2*n-i-2;
            for (int j = 0; j < 2*n-1; j++) {
                System.out.print(num);
                if(j<n-1) {
                    if (i > j)
                        num--;
                }
                else{
                    if(i >= 2*n-j-2)
                        num++;
                }
            }
            System.out.println();
            i=x;
        }
    }

}
