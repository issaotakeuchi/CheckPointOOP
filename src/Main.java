import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        PessoaFisica issao = new PessoaFisica ("issao@gmail.com", "11998769190", "1989-03-01", "Rua Cristóvão Lins, 115", "23555643450", "Issao", "Takeuchi");
        Request request1 = new Request("001", "xpto", "loren100");
        Request request2 = new Request("002", "xwyz", "loren100");
        Request request3 = new Request("003", "abcd", "loren100");

        issao.addRequest(request1);
        issao.addRequest(request2);
        issao.addRequest(request3);

        request1.acceptRequest("john");
        request1.deliverJob();
        issao.followRequest();

        request1.acceptJobDelivered(false, "miss something");
        issao.followRequest();

        request1.deliverJob();

        request1.acceptJobDelivered(true,"well done");
        issao.followRequest();




        System.out.println(issao.getDateOfBirth());
        System.out.println(issao.getEmail());
        System.out.println(issao.getAddress());
        System.out.println(issao.getTelephone());



    }

}
