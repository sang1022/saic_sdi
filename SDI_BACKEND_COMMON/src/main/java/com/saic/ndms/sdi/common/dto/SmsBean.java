package com.saic.ndms.sdi.common.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsBean {

    private String appId;

    private String msg;

    private List<String> das = new ArrayList<String>();

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @JsonProperty("msg")
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @JsonProperty("das")
    public String[] getDas() {
        String[] array = new String[das.size()];
        das.toArray(array);
        return array;
    }

    public void addDas(String das) {
        this.das.add(das);
    }

    @Override
    public String toString() {
        return "SmsBean{" +
                "appId='" + appId + '\'' +
                ", msg='" + msg + '\'' +
                ", das=" + das +
                '}';
    }
}
