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
        for (Worker wok : workers){
            if(worker.getId() == wok.getId()){
                int i = workers.indexOf(wok);
                workers.set(i, worker);
            }
        }
    }

    public void deleteWorker(int id){
        for(Worker workerA : workers){
            if(workerA.getId() == id){
                workers.remove(workerA.getId());
            }
        }
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

    public void updateDepartment(Department department){
        for (Department dep : departments){
            if(dep.getId() == department.getId()){
                int i = departments.indexOf(dep);
                departments.set(i, department);
            }
        }
    }

    public void deleteDepartment(int id){
        for(Department depA : departments){
            if(depA.getId() == id){
                departments.remove(depA.getId());
            }
        }
    }

    private void addMockData() {

        Department janitor = new Department(1, "Janitor");
        addDepartment(janitor);
        Department CEO = new Department(2, "CEO");
        addDepartment(CEO);
        Department developer = new Department(3, "Developer");
        addDepartment(developer);
        Worker worker1 = new Worker(1, "Sven Svensson", "30", janitor);
        addWorker(worker1);
        Worker worker2 = new Worker(2, "Chef Chefsson", "47", CEO);
        addWorker(worker2);
        Worker worker3 = new Worker(3, "Dev Devsson", "5", developer);
        addWorker(worker3);

    }


}
