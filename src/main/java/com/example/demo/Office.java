package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Office {

    List<Worker> workers = new ArrayList<>();
    List<Department> departments = new ArrayList<>();

    public Office(){
        this.workers = new ArrayList<>();
        this.departments = new ArrayList<>();
        addMockData();
    }

    public List<Worker> getWorkers(String searchString) {
        //if (searchString == "")
            return workers;
/*
        ArrayList<Worker> items = new ArrayList<>();
        for (Worker worker : workers) {
            if(worker.getName().contains(searchString))
                items.add(worker);
        }
        return items;
  */
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void updateWorker(Worker worker){
    }

    public List<Department> getDepartments(String searchString) {
        if (searchString == "")
            return departments;

        ArrayList<Department> items = new ArrayList<>();
        for (Department department : departments) {
            if(department.getName().contains(searchString))
                items.add(department);
        }
        return items;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    private void addMockData() {

        Department janitor = new Department("Janitor");
        addDepartment(janitor);
        Department CEO = new Department("CEO");
        addDepartment(CEO);
        Department developer = new Department("Developer");
        addDepartment(developer);
        Worker worker1 = new Worker("1", "Sven Svensson", "30", janitor);
        addWorker(worker1);
        Worker worker2 = new Worker("2", "Chef Chefsson", "47", CEO);
        addWorker(worker2);
        Worker worker3 = new Worker("3", "Dev Devsson", "5", developer);
        addWorker(worker3);

    }


}
