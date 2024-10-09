package com.example.menu.repo;

import com.example.menu.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface Menu extends JpaRepository<MenuItem,Integer> {

}
