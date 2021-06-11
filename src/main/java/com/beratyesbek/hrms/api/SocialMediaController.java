package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.dataAccess.abstracts.ISocialMediaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/socialMedia")
public class SocialMediaController {

    private ISocialMediaDao socialMediaDao;

    @Autowired
    public SocialMediaController(ISocialMediaDao socialMediaDao) {
        this.socialMediaDao = socialMediaDao;
    }
}
