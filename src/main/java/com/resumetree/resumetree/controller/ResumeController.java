package com.resumetree.resumetree.controller;

import com.resumetree.resumetree.models.Resume;
import com.resumetree.resumetree.repositories.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/resumes")
public class ResumeController {
    @Autowired
    ResumeRepository resumeRepo;

    @GetMapping("/all")
    public List<Resume> getAllResumes()
    {
        return resumeRepo.findAll();
    }

    @PostMapping("/add")
    public Resume addResume(@RequestBody Resume resume)
    {
        return resumeRepo.save(resume);
    }

    // method to update count of the resume of which the link is clicked
    @GetMapping("/{rid}")
    public ResponseEntity<String> updateCount(@PathVariable String rid)
    {
        Optional<Resume> resumeDoc = resumeRepo.findById(rid);
        if (resumeDoc.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            Resume res = resumeDoc.get();
            res.setVisits(res.getVisits() + 1);
            resumeRepo.save(res);
            return ResponseEntity.ok("count increased");
        }
    }
}
