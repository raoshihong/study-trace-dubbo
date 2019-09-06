package com.rao.study.trace.dubbo.controller;


import com.rao.study.trace.dubbo.constants.Urls;
import com.rao.study.trace.dubbo.entity.Event;
import com.rao.study.trace.dubbo.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * <p>
 * 事件记录总表 前端控制器
 * </p>
 *
 * @author 
 * @since 2019-09-06
 */
@RestController
public class EventController {

    @Autowired
    private IEventService iEventService;

    @GetMapping(value = Urls.V1.Event.SAVE)
    public void save(){
        Event event = new Event();
        event.setName("sdfsdfdddddd");
        event.setTime(LocalDateTime.now());
        iEventService.save(event);
    }
}
