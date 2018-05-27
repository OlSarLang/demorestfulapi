package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;
import sun.rmi.runtime.Log;

import javax.websocket.server.PathParam;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
//@RequestMapping("/office")
public class WorkController {

    Office office  = new Office();

    @RequestMapping(value = "/office", method = RequestMethod.GET)
    public List<Worker> getWorkers(@RequestParam(value="searchstring", defaultValue = "") String searchString){
        return office.getWorkers(searchString);
    }

    @RequestMapping(value = "/office", method = RequestMethod.POST)
      public Worker addWorker(@RequestBody Worker worker){
        office.addWorker(worker);
        return worker;
    }

    @RequestMapping(value = "/office/{id}", method = RequestMethod.PUT)
    public @ResponseBody String updateWorker(@RequestBody Worker worker){
        office.updateWorker(worker);
        System.out.println(worker.toString());
        return "ok";
    }

    @RequestMapping(value = "/office/{id}", method = RequestMethod.DELETE)
    public void deleteWorker(@PathVariable("id") int workerId){
        office.deleteWorker(workerId);
    }

    @RequestMapping(value = "/departments", method = RequestMethod.GET)
    public List<Department> getDepartments(@RequestParam(value = "searchstring", defaultValue = "") String searchString){
        return office.getDepartments(searchString);
    }

    @RequestMapping(value = "/departments", method = RequestMethod.POST)
    public Department addDepartment(@RequestBody Department department){
        office.addDepartment(department);
        return department;
    }

    @RequestMapping(value = "/departments/{id}", method = RequestMethod.PUT)
    public @ResponseBody String updateDepartment(@RequestBody Department department){
        office.updateDepartment(department);
        System.out.println();
        return "ok";
    }

    @RequestMapping(value = "/departments/{id}", method = RequestMethod.DELETE)
    public @ResponseBody String deleteDepartment(@PathVariable int id){
        office.deleteDepartment(id);
        System.out.println();
        return "ok";
    }

}
