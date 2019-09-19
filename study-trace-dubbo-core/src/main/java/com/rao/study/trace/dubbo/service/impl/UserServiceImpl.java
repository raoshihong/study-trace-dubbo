package com.rao.study.trace.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rao.study.trace.business.dto.UserDto;
import com.rao.study.trace.business.service.IUserFaced;
import com.rao.study.trace.dubbo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Reference(timeout = 50000,check = false)
    private IUserFaced iUserFaced;

    public void save(UserDto userDto){
        iUserFaced.save(userDto);
    }

    @Override
    public void update(UserDto userDto) {
        iUserFaced.update(userDto);
    }

    @Override
    public void delete(Long id) {
        iUserFaced.delete(id);
    }
}
