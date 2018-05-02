package com.github.yihtserns.test.springboot.json.envvar;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @author yihtserns
 */
@ConfigurationProperties(prefix = "com.github.yihtserns")
public class MyProperties {

    Map<String, String> testMapping;

    String test;

    public Map<String, String> getTestMapping() {
        return testMapping;
    }

    public void setTestMapping(Map<String, String> testMapping) {
        this.testMapping = testMapping;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
