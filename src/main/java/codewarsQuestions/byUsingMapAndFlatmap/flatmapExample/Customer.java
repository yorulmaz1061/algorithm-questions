package codewarsQuestions.byUsingMapAndFlatmap.flatmapExample;

import java.util.List;

public class Customer {
    private int id;
    private String email;
    private List<String> phoneNumbers;

    public Customer(int id) {
        this.id = id;
    }

    public Customer(int id, String email, List<String> phoneNumbers) {
        this.id = id;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
