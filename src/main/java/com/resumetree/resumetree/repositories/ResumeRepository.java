package com.resumetree.resumetree.repositories;

import com.resumetree.resumetree.models.Resume;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ResumeRepository extends MongoRepository<Resume, String>
{
    List<Resume> findByStatus(String status);
}
