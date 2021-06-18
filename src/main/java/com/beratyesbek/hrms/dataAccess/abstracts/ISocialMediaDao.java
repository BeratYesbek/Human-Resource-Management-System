package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.core.SpringBootQueries;
import com.beratyesbek.hrms.entities.concretes.Ability;
import com.beratyesbek.hrms.entities.concretes.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ISocialMediaDao extends JpaRepository<SocialMedia,Integer> {

    List<Ability> getByJobSeekerId(int id);
}
