package com.rao.study.trace.dubbo.service.impl;

import com.rao.study.trace.dubbo.entity.EventPlace;
import com.rao.study.trace.dubbo.mapper.EventPlaceMapper;
import com.rao.study.trace.dubbo.service.IEventPlaceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 事件发生地记录表 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-09-06
 */
@Service
public class EventPlaceServiceImpl extends ServiceImpl<EventPlaceMapper, EventPlace> implements IEventPlaceService {

}
