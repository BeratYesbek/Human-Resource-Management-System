package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.ILanguageService;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/languages")
public class LanguageController {

    private ILanguageService languageService;

    @Autowired
    public LanguageController(ILanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping("/add")
    private Result add(@RequestBody Language language){
        return languageService.add(language);
    }
}
