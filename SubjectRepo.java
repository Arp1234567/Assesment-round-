package com.Repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Long> {
}

