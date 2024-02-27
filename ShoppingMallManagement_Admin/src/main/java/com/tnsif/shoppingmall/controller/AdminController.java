package com.tnsif.shoppingmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.shoppingmall.entity.Admin;
import com.tnsif.shoppingmall.repository.AdminRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminRepository adminRepo;

	@GetMapping("/{id}")
	public Admin getAdminById(@PathVariable Long id) {
		return adminRepo.findById(id).get();
	}

	@GetMapping
	public List<Admin> getAllAdmins() {
		return adminRepo.findAll();
	}

	@PostMapping
	public Admin createAdmin(@RequestBody Admin Admin) {
		return adminRepo.save(Admin);
	}

	@PutMapping("/{id}")
	public void updateAdmin(@PathVariable Long id, @RequestBody Admin Admin) {

		Admin.setId(id);
		adminRepo.save(Admin);
	}

	@DeleteMapping("/{id}")
	public void deleteAdminById(@PathVariable Long id) {
		adminRepo.deleteById(id);
	}
}
