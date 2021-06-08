package com.beratyesbek.hrms.core.utilities;

public class Result {

    private Boolean success;
    private String message;

    public Result(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
    public  Result(Boolean success){
        this.success = success;
    }


    public Boolean getSuccess() {
        return success;
    }
    public String getMessage() {
        return message;
    }
}
