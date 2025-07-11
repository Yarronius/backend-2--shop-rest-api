package com.yaroslavkislyi.shop.repository;

import com.yaroslavkislyi.shop.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findAllByNameAndSurname(String name, String surname);
}
