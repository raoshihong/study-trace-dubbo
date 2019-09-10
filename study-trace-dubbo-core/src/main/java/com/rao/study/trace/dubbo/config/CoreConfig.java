package com.rao.study.trace.dubbo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@MapperScan(basePackages = {"com.rao.study.trace.dubbo.mapper"})
@ComponentScan(basePackages = {"com.rao.study.trace.*"})//开启加密配置
@EnableAspectJAutoProxy
public class CoreConfig {
}
