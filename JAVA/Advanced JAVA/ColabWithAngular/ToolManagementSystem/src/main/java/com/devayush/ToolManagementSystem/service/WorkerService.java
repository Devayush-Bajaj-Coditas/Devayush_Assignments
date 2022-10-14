package com.devayush.ToolManagementSystem.service;


import com.devayush.ToolManagementSystem.entity.WorkerEntity;
import com.devayush.ToolManagementSystem.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    WorkerRepository workerRepository;

    public WorkerEntity saveWorker(WorkerEntity worker){
        return workerRepository.save(worker);
    }

    public List<WorkerEntity> workers (){
        return workerRepository.findAll();
    }

    public WorkerEntity findWorkerById(int id){
        return workerRepository.findById(id).orElse(null);
    }

    public WorkerEntity updateWorker (WorkerEntity workerUpdates){
        WorkerEntity existingWorker = workerRepository.findById(workerUpdates.getWorkerId()).orElse(null);

        existingWorker.setWorkerName(workerUpdates.getWorkerName());
        existingWorker.setWorkerPassword(workerUpdates.getWorkerPassword());
        existingWorker.setWorkerUsername(workerUpdates.getWorkerUsername());
        existingWorker.setWorkerSalary(workerUpdates.getWorkerSalary());
        existingWorker.setOrders(workerUpdates.getOrders());   //doubt
        return existingWorker;
    }

    public String deleteWorker(int id){
        workerRepository.deleteById(id);
        return "Deleted successfully";
    }
}
