package org.cnc.garden.sentinel.flowcontrol.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * org.cnc.garden.sentinel.flowcontrol.controller - FlowController
 *
 * @author tony-is-coding
 * @date 2022/5/31 17:30
 */
@RestController
@RequestMapping(value = "flow_control")
public class FlowController {
    @GetMapping(value = "/limit_5_per_second")
    public String limitFivePerSecond() {
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "request success !!!";
    }

    @GetMapping(value = "/limit_10_per_second")
    public String limitTenPerSecond() {
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "request success !!!";
    }
}
