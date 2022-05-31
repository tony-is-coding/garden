package org.cnc.garden.sentinel.flowcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * org.cnc.garden.sentinel.flowcontrol - FlowControlApplication
 *
 * @author tony-is-coding
 * @date 2022/5/31 16:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FlowControlApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlowControlApplication.class, args);
    }
}
