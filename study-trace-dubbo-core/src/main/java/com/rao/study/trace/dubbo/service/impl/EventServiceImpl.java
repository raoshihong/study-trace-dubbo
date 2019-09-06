package com.rao.study.trace.dubbo.service.impl;

import com.rao.study.trace.dubbo.entity.Event;
import com.rao.study.trace.dubbo.mapper.EventMapper;
import com.rao.study.trace.dubbo.service.IEventService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 事件记录总表 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-09-06
 */
@Service
public class EventServiceImpl extends ServiceImpl<EventMapper, Event> implements IEventService {

}
