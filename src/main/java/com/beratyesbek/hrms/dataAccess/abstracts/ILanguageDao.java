package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILanguageDao extends JpaRepository<Language,Integer> {

    List<Language> getByJobSeeker_Id(int id);
}
