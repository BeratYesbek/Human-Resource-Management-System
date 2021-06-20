package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IAbilityService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.ErrorDataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.Ability;
import com.beratyesbek.hrms.entities.concretes.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/abilities")
@CrossOrigin("http://localhost:3000/")

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
    private DataResult getById( int ability_id) {
        return abilityService.getById(ability_id);
    }

    @GetMapping("/getByJobSeekerId")
    private DataResult getByJobSeekerId(int id) {
        return  abilityService.getByJobSeekerId(id);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException
            (MethodArgumentNotValidException exceptions){
        Map<String,String> validationErrors = new HashMap<String, String>();
        for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        ErrorDataResult<Object> errors
                = new ErrorDataResult<Object>("Validation error",validationErrors);
        return errors;
    }


}
