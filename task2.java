import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List <String> i=Arrays.asList("asfdfsg","sdgfsgs","","sdg","dg");
        long num =i.stream().filter(x->x.length()>3).count();
        System.out.printf("list %s has %d strings of length more than 3 %n",i,num);
    }
}
