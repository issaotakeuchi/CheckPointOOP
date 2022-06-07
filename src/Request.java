import java.time.LocalDate;

public class Request {
    private static int requestNumber = 0;
    private String subject;
    private String details;
    private String status;
    private String employeeInCharge;
    private LocalDate dateOfRequest;

    //constructor without  status and employeeInCharge because these information will be included by employee class.
    public Request(String subject, String details) {
        Request.requestNumber++;
        this.subject = subject;
        this.details = details;
       // this.dateOfRequest = dateOfRequest;
    }
}
