package codewarsQuestions.byUsingMapAndFlatmap;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public  List<Employee> readAll(){

       return Arrays.asList(new Employee(100,"Mike", "mmm@nn.com", Arrays.asList("11112222","333338880")),
                new Employee(400,"Moo", "lll@kk.com", Arrays.asList("44445655","34243223")),
                new Employee(120,"Monno", "mommm@kk.com", Arrays.asList("3333332","4444444")),
                new Employee(156,"Matt", "matt@hh.com", Arrays.asList("666662","77777777")),
                new Employee(110,"Muu", "muu@nn.com", Arrays.asList("8888888","111126666"))
        );


    }
}


