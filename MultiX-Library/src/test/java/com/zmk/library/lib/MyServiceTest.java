package com.zmk.library.lib;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.zmk.library.lib.service.MyService;


@SpringBootTest("service.message=Hello")
public class MyServiceTest {

  @Autowired
  private MyService myService;

  @Test
  public void contextLoads1() {
    assertThat(myService.message()).isNotNull();
  }
//  @Test
//  public void contextLoads() {
//    assertThat(myService.message()).isNull();
//  }

  @SpringBootApplication
  static class TestConfiguration {
  }

}
