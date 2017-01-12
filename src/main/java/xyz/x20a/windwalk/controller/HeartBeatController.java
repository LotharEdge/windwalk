package xyz.x20a.windwalk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by crl on 16/12/29.
 */
@RestController
public class HeartBeatController {

    @RequestMapping(value = "/heartbeat",method = RequestMethod.GET)
    public String getHeartBeat(){
        return "ok";
    }
}
