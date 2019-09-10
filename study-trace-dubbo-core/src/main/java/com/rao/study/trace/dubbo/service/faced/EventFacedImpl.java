package com.rao.study.trace.dubbo.service.faced;

import com.alibaba.dubbo.config.annotation.Service;
import com.rao.study.trace.dubbo.dto.EventDto;
import com.rao.study.trace.dubbo.entity.Event;
import com.rao.study.trace.dubbo.service.IEventFaced;
import com.rao.study.trace.dubbo.service.IEventService;
import com.rao.study.trace.utils.LocalEvent;
import com.rao.study.trace.utils.ThreadLocalUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Service   //属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Component
public class EventFacedImpl implements IEventFaced {

    @Autowired
    private IEventService iEventService;

    @Override
    public void update(EventDto eventDto) {
        LocalEvent localEvent = ThreadLocalUtils.get();
        Event event = new Event();
        event.setId(eventDto.getId());
        event.setName(eventDto.getName());
        event.setType(eventDto.getType());
        event.setTime(LocalDateTime.now());
        iEventService.updateById(event);
    }
}
