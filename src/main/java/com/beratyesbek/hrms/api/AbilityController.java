package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IAbilityService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.Ability;
import com.beratyesbek.hrms.entities.concretes.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/abilities")
public class AbilityController {

    private IAbilityService abilityService;

    @Autowired
    public AbilityController(IAbilityService abilityService) {
        this.abilityService = abilityService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Ability ability) {
        return this.abilityService.add(ability);
    }

    @PostMapping("/delete")
    private Result delete(@RequestBody Ability ability) {
        return abilityService.delete(ability);
    }

    @GetMapping("/getAll")
    private DataResult<List<Ability>> getAll() {
        return abilityService.getAll();
    }

    @GetMapping("/getById")
    private DataResult getById(@RequestBody int id) {
        return abilityService.getById(id);
    }


}
