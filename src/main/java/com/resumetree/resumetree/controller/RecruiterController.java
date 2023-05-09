package com.resumetree.resumetree.controller;

import com.resumetree.resumetree.models.Resume;
import com.resumetree.resumetree.services.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {
    @Autowired
    private RecruiterService recruiterService;

    @GetMapping("/all")
    public List<Resume> getAllActiveResumes()
    {
        return recruiterService.getAll();
    }
}
