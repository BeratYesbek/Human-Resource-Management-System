package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IImageService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessResult;
import com.beratyesbek.hrms.dataAccess.abstracts.IImageDao;
import com.beratyesbek.hrms.entities.concretes.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageManager implements IImageService {
    private IImageDao imageDao;

    @Autowired
    public ImageManager(IImageDao imageDao) {
        this.imageDao = imageDao;
    }

    @Override
    public Result add(Image entity) {
        imageDao.save(entity);
        return new SuccessResult("Data was added successfully");
    }

    @Override
    public Result update(Image entity) {
        return null;
    }

    @Override
    public Result delete(Image entity) {
        return null;
    }

    @Override
    public DataResult<List<Image>> getAll() {
        return null;
    }

    @Override
    public DataResult<Image> getById(int id) {
        return null;
    }
}
