package com.devayush.ToolManagementSystem.service;


import com.devayush.ToolManagementSystem.entity.ToolEntity;
import com.devayush.ToolManagementSystem.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToolService {
    @Autowired
    public ToolRepository toolRepository;

    public ToolEntity saveTool(ToolEntity toolEntity){
        return toolRepository.save(toolEntity);
    }

    public ToolEntity getToolById (int id){
        return toolRepository.findById(id).orElse(null);
    }

    public ToolEntity updateTool (ToolEntity updatedTool){
        ToolEntity existingTool = toolRepository.findById(updatedTool.getToolId()).orElse(null);
        existingTool.setToolName(updatedTool.getToolName());
        existingTool.setToolPrice(updatedTool.getToolPrice());
        existingTool.setToolQuantity(updatedTool.getToolQuantity());
        existingTool.setToolSize(updatedTool.getToolSize());
        existingTool.setToolsOrder(updatedTool.getToolsOrder());
        return toolRepository.save(existingTool);
    }

    public String deleteTool(int id){
        toolRepository.deleteById(id);
        return "Tool deleted successfully";
    }

}
