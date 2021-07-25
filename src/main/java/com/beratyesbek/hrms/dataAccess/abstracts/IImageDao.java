package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.entities.concretes.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IImageDao extends JpaRepository<Image,Integer> {
}
