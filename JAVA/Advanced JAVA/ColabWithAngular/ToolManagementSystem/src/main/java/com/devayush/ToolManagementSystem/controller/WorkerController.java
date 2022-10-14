package com.devayush.ToolManagementSystem.controller;


import com.devayush.ToolManagementSystem.entity.WorkerEntity;
import com.devayush.ToolManagementSystem.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkerController {

    @Autowired
    WorkerService workerService;
    @RequestMapping(value = "/addWorker", consumes = "application/JSON")
    public WorkerEntity createWorker(@RequestBody WorkerEntity worker){
        return workerService.saveWorker(worker);
    }

    @GetMapping("/allWorkers")
    public List<WorkerEntity> getAllWorkers(){
        return workerService.workers();
    }

    @GetMapping("/allWorkers/{id}")
    public WorkerEntity getWorkerById(@PathVariable int id){
        return workerService.findWorkerById(id);
    }

    @PutMapping("/allWorkers/update")
    public WorkerEntity updateWorker (WorkerEntity worker){
        return workerService.updateWorker(worker);
    }

    @DeleteMapping("/allWorkers/delete/{id}")
    public String deleteWorker(@PathVariable int id){
        return workerService.deleteWorker(id);
    }

}