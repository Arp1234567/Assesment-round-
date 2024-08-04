package com.Repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
}


