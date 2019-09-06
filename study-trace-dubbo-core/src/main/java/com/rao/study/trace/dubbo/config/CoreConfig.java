package com.rao.study.trace.dubbo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@MapperScan(basePackages = {"com.rao.study.trace.dubbo.mapper"})
@EnableAspectJAutoProxy
public class CoreConfig {
}
