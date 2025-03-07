package codewarsQuestions.byUsingFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static void main(String[] args) {
        List<Object> liste = new ArrayList<>(Arrays.asList(1, 2, "1", "b"));
        System.out.println(filterList(liste));


    }

    public static List<Object> filterList(final List<Object> list) {
       /* List<Object> integersOnly=new ArrayList<>();
        integersOnly = list.stream().filter(obj->obj instanceof Integer).map(obj->(Integer)obj).collect(Collectors.toList());
        return integersOnly;*/

        return list.stream().filter(p->p instanceof Integer).collect(Collectors.toList());
    }


}




