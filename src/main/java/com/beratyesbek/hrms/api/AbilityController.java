package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IAbilityService;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.Ability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/add")
    public Result add(@RequestBody Ability ability){
        return this.abilityService.add(ability);
    }


}
