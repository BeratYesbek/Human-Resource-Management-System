package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IAbilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/abilities")
public class AbilityController {

    private IAbilityService abilityService;

    @Autowired
    public AbilityController(IAbilityService abilityService) {
        this.abilityService = abilityService;
    }

}
