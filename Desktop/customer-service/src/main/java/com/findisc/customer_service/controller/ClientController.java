package com.findisc.customer_service.controller;

import com.findisc.customer_service.entity.Client;
import com.findisc.customer_service.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // CREATE
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    // READ ALL
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Client getClient(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Client updateClient(
            @PathVariable Long id,
            @RequestBody Client client) {
        return clientService.updateClient(id, client);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}
