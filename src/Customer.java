import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    private String email;
    private String telephone;
    private LocalDate dateOfBirth;
    private String address;
    private List<Request> requests;

    //constructor
    public Customer(String email, String telephone, String dateOfBirth, String address) {
        this.email = email;
        this.telephone = telephone;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        this.address = address;
        this.requests = new ArrayList<Request>();
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

    public List<Request> getRequests() {
        return requests;
    }


    public void addRequest(Request request) {
        requests.add(request);
    }
    public void followRequest() {
        requests.forEach(request -> {
            System.out.println("Request number: " + request.getRequestNumber());
            System.out.println("Subject: " + request.getSubject());
            System.out.println("Details: " + request.getDetails());
            System.out.println("In charge of: " + request.getEmployeeInCharge());
            System.out.println("Status: " + request.getStatus());
            System.out.println("Date of request: " + request.getDateOfRequest());
            System.out.println("Comments: " + request.getComments());
        });
    }
 }






