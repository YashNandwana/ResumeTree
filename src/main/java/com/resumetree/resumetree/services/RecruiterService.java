package com.resumetree.resumetree.services;

import com.resumetree.resumetree.models.Resume;
import com.resumetree.resumetree.repositories.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruiterService {

    @Autowired
    private ResumeRepository resumeRepository;
    public List<Resume> getAll()
    {
        return resumeRepository.findByStatus("active");
    }
}
