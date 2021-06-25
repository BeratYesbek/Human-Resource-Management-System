package com.beratyesbek.hrms.business.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.Language;

import java.util.List;

public interface ILanguageService extends IServiceRepository<Language>{

    DataResult<List<Language>> getByJobSeekerId(int id);
}
