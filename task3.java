import java.util.Arrays;
import java.util.List;

public class task3 {
    public  void main(String[] args) {
        List<String> s= Arrays.asList("asfaf","afgsdg","sghdh","tyey") ;
        long count=s.stream().filter(x->x.startsWith("a")).count();
        System.out.printf("In List %s have word start with a %d %n",s,count);
       }
}
