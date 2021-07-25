package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.ISocialMediaService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.dataAccess.abstracts.ISocialMediaDao;
import com.beratyesbek.hrms.entities.concretes.JobSeeker;
import com.beratyesbek.hrms.entities.concretes.SocialMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/socialMedia")
@CrossOrigin
public class SocialMediaController {

    private ISocialMediaService socialMediaService;

    @Autowired
    public SocialMediaController(ISocialMediaService socialMediaService) {
        this.socialMediaService = socialMediaService;
    }

    @GetMapping("/getAll")
    private DataResult<List<SocialMedia>> getAll() {
        return socialMediaService.getAll();
    }

    @GetMapping("/getById")
    private DataResult getById(int id) {
        return socialMediaService.getById(id);
    }

    @PostMapping("/add")
    private Result add(@RequestBody SocialMedia socialMedia) {
        return socialMediaService.add(socialMedia);
    }

    @PostMapping("/delete")
    private Result delete(@RequestBody SocialMedia socialMedia) {
        return socialMediaService.delete(socialMedia);
    }
}
