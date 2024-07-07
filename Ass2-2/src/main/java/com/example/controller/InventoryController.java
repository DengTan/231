package com.example.controller;

import com.example.entity.Inventory;
import com.example.service.InventoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InventoryController {
	
	private InventoryService inventoryService;
	
	public InventoryController(InventoryService inventoryService) {
		super();
		this.inventoryService = inventoryService;
	}
	
	@GetMapping("/admin")
	public String listInventory(Model model) {
		model.addAttribute("inventories", inventoryService.getAllInventories());
		return "admin";
	}
	
}


