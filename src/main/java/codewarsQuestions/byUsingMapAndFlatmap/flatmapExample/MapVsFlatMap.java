package codewarsQuestions.byUsingMapAndFlatmap.flatmapExample;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customerList=DataBase.getAll();
        //List<Customer> convert List<String> -> Data Transformation.
        //one to one mapping
        List<String> emails = customerList.stream().map(p -> p.getEmail()).collect(Collectors.toList());
        System.out.println(emails);
        //one customer have many phone numbers
        List<String> phoneNumbers = customerList.stream().flatMap(p -> p.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }
}
