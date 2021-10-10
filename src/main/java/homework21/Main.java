package homework21;

import homework21.dao.ClientDao;
import homework21.dao.StatusDao;
import homework21.entity.Account;
import homework21.entity.Client;
import homework21.entity.ClientProfile;
import homework21.entity.Status;

import java.util.Collections;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        ClientDao clientDao = new ClientDao();
        StatusDao statusDao = new StatusDao();

        Client client = new Client();
        client.setName("Richard");
        client.setEmail("vadim.test@test.com");
        client.setPhone(380951111189L);
        client.setAbout("Hello my name is");
        client.setAge(57);

        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setClientCountryOfResidence("Ukraine");
        clientProfile.setMarriageStatus("not married");
        clientProfile.setNumberOfKids("no kids");

        Status status = new Status();
        status.setAlias("Standard");
        status.setDescription("Standard status");

        Account account = new Account();
        account.setNumber("123456");
        account.setValue(123456.78);

        client.setAccounts(Collections.singleton(account));
        client.setStatuses(new HashSet<>(statusDao.findAllStatuses()));
        client.setClientProfile(clientProfile);

        clientDao.save(client);

        clientDao.findAllCustomers().forEach(System.out::println);

    }
}
