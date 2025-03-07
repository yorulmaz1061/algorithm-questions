package dishTask;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("borek", true, 200, Type.OTHER),
                new Dish("kebab", false, 400, Type.MEAT),
                new Dish("HamsiliPilav", false, 250, Type.FISH),
                new Dish("fruit", true, 100, Type.OTHER)
        );
        menu.stream().filter(p->p.getCalories()<=250).forEach(System.out::println);
        System.out.println("--------------------");
        menu.stream().filter(p->p.getType()==Type.FISH).forEach(System.out::println);
        System.out.println("----------------");
        menu.stream().filter(p->p.getCalories()<=250).map(Dish::getName).forEach(System.out::println);


    }


}
