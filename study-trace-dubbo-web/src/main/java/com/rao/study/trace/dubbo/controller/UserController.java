package com.rao.study.trace.dubbo.controller;

import com.rao.study.trace.business.dto.UserDto;
import com.rao.study.trace.dubbo.constants.Urls;
import com.rao.study.trace.dubbo.service.UserService;
import com.rao.study.trace.lib.annotation.EnableTrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @EnableTrace(name = "保存用户",place = "user/save",system = "study-trace-dubbo",type = "save")
    @PostMapping(value = Urls.V1.User.SAVE)
    public void save(@RequestBody UserDto userDto){
        userService.save(userDto);
    }

    @EnableTrace(name = "更新用户",place = "user/update",system = "study-trace-dubbo",type = "update")
    @PostMapping(value = Urls.V1.User.UPDATE)
    public void update(@RequestBody UserDto userDto){
        userService.update(userDto);
    }

    @EnableTrace(name = "删除用户",place = "user/delete",system = "study-trace-dubbo",type = "delete")
    @PostMapping(value = Urls.V1.User.DELETE)
    public void delete(@PathVariable("id") Long id){
        userService.delete(id);
    }

}
