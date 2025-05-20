package com.gestion.gestion6_query.service;

import com.gestion.gestion6_query.entity.Client;
import com.gestion.gestion6_query.entity.Orders;
import com.gestion.gestion6_query.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    public List<Client> findClientsByName(String ville) {
        return clientRepository.findClientsByVille(ville);
    }

    public List<Orders> getOrdersByClientId(Long clientId) {
        return clientRepository.findById(clientId).map(Client::getOrders)
                .orElse(Collections.emptyList());}
}


