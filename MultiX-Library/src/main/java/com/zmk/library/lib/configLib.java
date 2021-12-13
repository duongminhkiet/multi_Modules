package com.zmk.library.lib;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value={"classpath:application2.properties"}, ignoreResourceNotFound = true)
public class configLib {

}
