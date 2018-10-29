package com.wso2telco.ids.makerchecker.dto;

import java.util.List;

public class HumanTaskListResponseDto {
    private boolean error;
    private String message;
    private List<HumanTaskDto> list;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<HumanTaskDto> getList() {
        return list;
    }

    public void setList(List<HumanTaskDto> list) {
        this.list = list;
    }
}
