package com.findisc.customer_service.service;

import com.findisc.customer_service.entity.Client;
import java.util.List;

public interface ClientService {

    Client createClient(Client client);

    List<Client> getAllClients();

    Client getClientById(Long id);

    Client updateClient(Long id, Client client);

    void deleteClient(Long id);
}
