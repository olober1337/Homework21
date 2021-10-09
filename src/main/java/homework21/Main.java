package homework21;

import homework21.dao.ClientDao;
import homework21.entity.Client;

public class Main {

    public static void main(String[] args) {

        ClientDao clientDao = new ClientDao();

        Client client = new Client();

        client.setName("Richard");
        client.setEmail("vadim.test@test.com");
        client.setPhone(380951111189L);
        client.setAbout("Hello my name is");
        client.setAge(57);
        clientDao.save(client);

        clientDao.findAllCustomers().forEach(System.out::println);

    }
}
