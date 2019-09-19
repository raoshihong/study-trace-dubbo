package com.rao.study.trace.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rao.study.trace.business.dto.ChannelDto;
import com.rao.study.trace.business.service.IChannelFaced;
import com.rao.study.trace.dubbo.constants.Urls;
import com.rao.study.trace.lib.annotation.EnableTrace;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController {
    @Reference(timeout = 50000,check = false)
    private IChannelFaced iChannelFaced;

    @EnableTrace(name = "保存渠道",place = "channel/save",system = "study-trace-dubbo",type = "save")
    @PostMapping(value = Urls.V1.Channel.SAVE)
    public void save(@RequestBody ChannelDto channelDto){
        iChannelFaced.save(channelDto);
    }

    @EnableTrace(name = "保存客户经理",place = "channel/disable",system = "study-trace-dubbo",type = "update")
    @PostMapping(value = Urls.V1.Channel.DISABLE)
    public void disable(@PathVariable Long id){
        iChannelFaced.disable(id);
    }

}
