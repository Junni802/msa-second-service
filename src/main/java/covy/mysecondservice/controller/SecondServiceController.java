package covy.mysecondservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <클래스 설명>
 *
 * @author : junni802
 * @date : 2025-02-12
 */

@RestController
@RequestMapping("/second-service")
public class SecondServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Second service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader(name = "second-request") String header) {
        System.out.println(header);
        return "Hello World in Second Service.";
    }

    @GetMapping("/check")
    public String check() {
        return "Hi, there. This is ad message from Second Service";
    }

}
