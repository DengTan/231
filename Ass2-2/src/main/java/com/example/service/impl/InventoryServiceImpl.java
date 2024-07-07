package com.example.service.impl;

import com.example.entity.Inventory;
import com.example.service.InventoryService;
import com.example.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	private InventoryRepository inventoryRepo;
	
	public InventoryServiceImpl(InventoryRepository inventoryRepo) {
		super();
		this.inventoryRepo = inventoryRepo;
	}
	
	@Override
	public List<Inventory> getAllInventories() {
		return inventoryRepo.findAll();
	}
}
