package com.rao.study.trace.dubbo.service.impl;

import com.rao.study.trace.dubbo.entity.EventContent;
import com.rao.study.trace.dubbo.mapper.EventContentMapper;
import com.rao.study.trace.dubbo.service.IEventContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 事件操作内容记录表 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-09-06
 */
@Service
public class EventContentServiceImpl extends ServiceImpl<EventContentMapper, EventContent> implements IEventContentService {

}
