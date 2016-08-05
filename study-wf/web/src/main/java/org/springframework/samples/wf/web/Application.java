package org.springframework.samples.wf.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.sample.wf.core.util.StringUtils;

@SpringBootApplication
public class Application {

  private static final Logger logger = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);

    logger.info("test:" + StringUtils.isBlank("test"));
    logger.info("test:" + StringUtils.isBlank("test"));
    logger.info("feature1:" + StringUtils.isBlank("feature1"));
    logger.info("feature2:" + StringUtils.isBlank("feature2"));
  }
}
