package com.beratyesbek.hrms.business;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import lombok.SneakyThrows;
import java.util.Map;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class CloudinaryManager {

    private Cloudinary cloudinary;

    public CloudinaryManager(){
        cloudinary =  new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "witchking",
                "api_key", "477146264736163",
                "api_secret", "ZprraPYwizVBCxtslooi1NfIwMw"));
    }

    @SneakyThrows
    public DataResult<Map> add(MultipartFile file){
       Map<String,Object> resultMap = cloudinary.uploader().upload(file.getBytes(),ObjectUtils.emptyMap());
       return new SuccessDataResult(resultMap);
    }
}
