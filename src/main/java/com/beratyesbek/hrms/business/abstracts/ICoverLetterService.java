package com.beratyesbek.hrms.business.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.CoverLetter;

import javax.xml.crypto.Data;

public interface ICoverLetterService extends IServiceRepository<CoverLetter>{

    DataResult<CoverLetter> getByJobSeekerId(int id);

}
