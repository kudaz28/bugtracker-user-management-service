package org.keysoft.bugtracker.repository;

import org.keysoft.bugtracker.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
