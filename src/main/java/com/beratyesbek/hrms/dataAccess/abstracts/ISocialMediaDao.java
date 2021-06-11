package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.entities.concretes.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISocialMediaDao extends JpaRepository<SocialMedia,Integer> {
}
