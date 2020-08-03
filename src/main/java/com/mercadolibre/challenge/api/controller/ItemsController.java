package com.mercadolibre.challenge.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mercadolibre.challenge.api.service.ItemsService;

@RestController
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	@GetMapping("/item/{id}")
	public ResponseEntity getItems(@PathVariable("id") String id) {
		return itemsService.getItems(id);
	}
}
