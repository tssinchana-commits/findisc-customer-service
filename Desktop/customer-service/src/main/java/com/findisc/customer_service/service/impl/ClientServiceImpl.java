package com.findisc.customer_service.service.impl;

import com.findisc.customer_service.entity.Client;
import com.findisc.customer_service.repository.ClientRepository;
import com.findisc.customer_service.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client updateClient(Long id, Client client) {
        Client existing = getClientById(id);

        existing.setFullName(client.getFullName());
        existing.setMobileNumber(client.getMobileNumber());
        existing.setEmail(client.getEmail());
        existing.setAddress(client.getAddress());
        existing.setKycStatus(client.getKycStatus());

        return clientRepository.save(existing);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
