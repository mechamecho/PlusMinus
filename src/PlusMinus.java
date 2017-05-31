/**
 * Created by Engineer on 5/20/2017.
 */
import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int N=Integer.parseInt(in.nextLine());
//        String [] array=in.nextLine().split("");
        double positive=0;
        double negative=0;
        double zero=0;
        for (int i=0; i<N; i++){
//            int number=Integer.parseInt(array[i]);
            int number=in.nextInt();
            if (number>0){
                positive++;
            }else if(number<0){
                negative++;
            }else{
                zero++;
            }
        }
        double pdecimal=positive/N;
        double ndecimal=negative/N;
        double zdecimal=zero/N;
        System.out.println(pdecimal);
        System.out.println(ndecimal);
        System.out.println(zdecimal);
    }
}
