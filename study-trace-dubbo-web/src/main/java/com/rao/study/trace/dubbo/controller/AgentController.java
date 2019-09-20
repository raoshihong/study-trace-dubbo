package com.rao.study.trace.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rao.study.trace.business.dto.AgentDto;
import com.rao.study.trace.business.service.IAgentFaced;
import com.rao.study.trace.dubbo.constants.Urls;
import com.rao.study.trace.lib.annotation.EnableTrace;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentController {

    @Reference(timeout = 50000,check = false)
    private IAgentFaced iAgentFaced;

    @EnableTrace(name = "保存客户经理",place = "agent",system = "study-trace-dubbo",type = "save")
    @PostMapping(value = Urls.V1.Agent.SAVE)
    public void save(@RequestBody AgentDto agentDto){
        iAgentFaced.save(agentDto);
    }

}
