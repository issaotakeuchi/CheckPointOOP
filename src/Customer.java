import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String email;
    private String telephone;
    private LocalDate dateOfBirth;
    private String address;
    private List<Request> requestList = new ArrayList<>();

    //constructor
    public Customer(String email, String telephone, String dateOfBirth, String address) {
        this.email = email;
        this.telephone = telephone;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        this.address = address;
    }

    //getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<Request> requestList) {
        this.requestList = requestList;
    }

    public void makeRequest(String subject, String details) {
        if (subject != null && details != null){
            Request oneRequestOfThisCustomer = new Request(subject, details);
            requestList.add(oneRequestOfThisCustomer);
        }
    }




}
