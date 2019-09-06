package com.rao.study.trace.dubbo.dto;

import java.io.Serializable;
import java.util.Date;

public class EventDto implements Serializable {

    private String name;

    /**
     * 事件发生时间
     */
    private Date time;

    /**
     * 事件发生方式
     */
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
