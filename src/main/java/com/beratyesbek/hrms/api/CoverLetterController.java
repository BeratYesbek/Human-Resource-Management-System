package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.ICoverLetterService;
import com.beratyesbek.hrms.business.abstracts.ILanguageService;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.CoverLetter;
import com.beratyesbek.hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/coverLetters")
public class CoverLetterController {

    private ICoverLetterService coverLetterService;

    @Autowired
    public CoverLetterController(ICoverLetterService coverLetterService) {
        this.coverLetterService = coverLetterService;
    }

    @PostMapping("/add")
    private Result add(@RequestBody CoverLetter coverLetter){
        return coverLetterService.add(coverLetter);
    }
}
