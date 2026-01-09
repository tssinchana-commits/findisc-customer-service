package com.findisc.customer_service.repository;

import com.findisc.customer_service.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
