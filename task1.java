import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class task1{
    public static void main(String[] args) {
        List <String> l= Arrays.asList("dfg","","dfhd","","dfgd","");
        Long count= l.stream() .filter(x->x.isEmpty()) .count();
        System.out.printf("list %s has %d empty strings %n",l ,count);
    }
}