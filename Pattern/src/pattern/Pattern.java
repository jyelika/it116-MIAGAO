
package pattern;


public class Pattern {

    
    public static void main(String[] args) {
   int rows = 4;
        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }   
        for(int i = 1; i <= 6; ++i) {
            for(int j = 1; j <= i; ++j) {
                if(i%2==0){
                System.out.print("* ");
                }
               
            }
            System.out.println();
        }
    }

