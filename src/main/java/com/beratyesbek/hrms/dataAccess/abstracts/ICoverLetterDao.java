package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.entities.concretes.CoverLetter;
import com.beratyesbek.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICoverLetterDao extends JpaRepository<CoverLetter,Integer> {
    CoverLetter getByJobSeeker_Id(int id);
}
