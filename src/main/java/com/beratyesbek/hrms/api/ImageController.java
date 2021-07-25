package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.CloudinaryManager;
import com.beratyesbek.hrms.business.abstracts.IImageService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.ErrorResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;

import javax.xml.crypto.Data;
import java.util.Map;
@RestController
@RequestMapping("/images")
@CrossOrigin
public class ImageController {

    private CloudinaryManager cloudinaryManager;
    private IImageService imageService;
    @Autowired
    public ImageController(IImageService imageService){
        cloudinaryManager = new CloudinaryManager();
        this.imageService = imageService;
    }

    @PostMapping("/addToCloud")
    ResponseEntity<DataResult<Map>> addToCloud(@RequestParam(value = "file") MultipartFile file){
        DataResult<Map> result = cloudinaryManager.add(file);
        return ResponseEntity.ok(result );
    }

    @PostMapping("/add")
    Result add(@RequestBody Image image){

        return imageService.add(image);
    }


}
