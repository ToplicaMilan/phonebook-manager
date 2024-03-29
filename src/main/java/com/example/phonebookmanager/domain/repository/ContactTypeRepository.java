package com.example.phonebookmanager.domain.repository;

import com.example.phonebookmanager.domain.entity.ContactType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactTypeRepository extends JpaRepository<ContactType, Long> {

    List<ContactType> findAll();

    Optional<ContactType> findByTypeIgnoreCase(String type);

    Optional<ContactType> findById(Long id);

    boolean existsByTypeIgnoreCase(String type);
}
