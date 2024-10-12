package com.example.menu.repo;

import com.example.menu.model.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderHist extends JpaRepository<OrderHistory, Long> {

}
