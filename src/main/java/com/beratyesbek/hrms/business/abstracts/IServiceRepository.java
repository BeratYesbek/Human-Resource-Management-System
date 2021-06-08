package com.beratyesbek.hrms.business.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;

import java.util.ArrayList;
import java.util.List;

public interface IServiceRepository<T> {
    Result add(T entity);
    Result update(T entity);
    Result delete(T entity);
    DataResult<List<T>> getAll();
    DataResult<T> getById(int id);
}
