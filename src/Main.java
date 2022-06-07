import java.util.List;

import static javax.management.modelmbean.DescriptorSupport.entities;

public class Main {
    public static void main(String[] args) {
        Customer issao = new Customer("issao@gmail.com", "11998769190", "1989-03-01", "Rua Cristóvão Lins, 115");

        issao.makeRequest("1 nova funcionalidade", "deve conter xpto");
        issao.makeRequest("2 nova funcionalidade", "deve conter xyz");
        issao.makeRequest("2 nova funcionalidade", "deve conter xyz");
        issao.makeRequest("2 nova funcionalidade", "deve conter xyz");
        issao.makeRequest("2 nova funcionalidade", "deve conter xyz");
        issao.makeRequest("2 nova funcionalidade", "deve conter xyz");
        System.out.println(issao.getDateOfBirth());
        System.out.println(issao.getRequestList());

        List<Request> field1List = requestList.stream().map(YourEntity::getField1).collect(Collectors.toList());


    }

}
