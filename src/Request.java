import java.time.LocalDate;
import java.util.PrimitiveIterator;

public class Request {
    private int requestNumber = 0;
    private String subject;
    private String details;
    private String status;
    private String employeeInCharge;
    private LocalDate dateOfRequest;
    private String comments;

    //constructor
    public Request(String subject, String details) {
        this.requestNumber++;
        this.subject = subject;
        this.details = details;
        this.dateOfRequest = LocalDate.now();
        this.status = "Pending";
        this.employeeInCharge = "Pending";
        this.comments = "";

    }

    //getters and setters
    public int getRequestNumber() {
        return requestNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmployeeInCharge() {
        return employeeInCharge;
    }

    public void setEmployeeInCharge(String employeeInCharge) {
        this.employeeInCharge = employeeInCharge;
    }

    public LocalDate getDateOfRequest() {
        return dateOfRequest;
    }


    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void acceptRequest(String employee) {
        setEmployeeInCharge(employee);
    }
    public void deliverJob() {
        setStatus("done");
    }

    public void acceptJobDelivered(Boolean decision, String comments) {
        if (decision) {
            setStatus("finished");
            setComments(comments);
        } else {
            setStatus("pending");
            setComments(comments);
        }
    }


}
