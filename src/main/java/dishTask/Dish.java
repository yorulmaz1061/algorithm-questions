package dishTask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Dish {
    private String name;
    private boolean isVegetarian;
    private int calories;
    private Type type;
}
