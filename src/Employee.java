import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String contact;
    private List<Request> requests;

    public Employee(String name, String contact) {
        this.name = name;
        this.contact = contact;
        this.requests = new ArrayList<Request>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void addRequest(Request request) {
        requests.add(request);
    }
}
