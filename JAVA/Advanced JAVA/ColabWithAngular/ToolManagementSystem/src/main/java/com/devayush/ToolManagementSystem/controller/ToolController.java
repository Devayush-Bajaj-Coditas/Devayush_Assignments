package com.devayush.ToolManagementSystem.controller;

import com.devayush.ToolManagementSystem.entity.ToolEntity;
import com.devayush.ToolManagementSystem.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToolController {
    @Autowired
    private ToolService toolService;

    @RequestMapping(value = "/addTool", consumes = "application/JSON")
    public ToolEntity addTool(@RequestBody ToolEntity tool){
        return toolService.saveTool(tool);
    }

    @GetMapping("/allTools")
    public List<ToolEntity> fetchTools(){
        return toolService.toolRepository.findAll();
    }

    @GetMapping("/allTools/{id}")
    public ToolEntity getToolById(@PathVariable int id){
        return toolService.getToolById(id);
    }

    @PutMapping("allTools/update")
    public ToolEntity updateTool(@RequestBody ToolEntity tool){
        return toolService.updateTool(tool);
    }

    @DeleteMapping("allTools/delete/{id}")
    public String deleteTool(@PathVariable int id){
        return toolService.deleteTool(id);
    }

}
