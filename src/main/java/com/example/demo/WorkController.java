package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/workers")
public class WorkController {

    Worker worker;

    @ResponseBody
    @RequestMapping(method = GET, produces = "application/json")
    public List<Worker> workerList{
        return workerList;
    }
}
