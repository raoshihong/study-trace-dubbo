package com.rao.study.trace.dubbo.service;

import com.rao.study.trace.business.dto.UserDto;

public interface UserService {
    void save(UserDto userDto);
    void update(UserDto userDto);
    void delete(Long id);
}
