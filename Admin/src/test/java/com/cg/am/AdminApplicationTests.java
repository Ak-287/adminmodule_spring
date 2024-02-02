package com.cg.am;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class AdminModuleApplicationTests {
@Autowired
	AdminRepository aRepo;
	

@Test
@Order(1)
	public void testCreate() {
		Admin a=new Admin();
		a.setId(1);
		a.setName("Admin");
		a.setPassword("abc123");
		a.setMall("hyper");
		a.setPhone(995279504);
		aRepo.save(a);
		assertNotNull(aRepo.findById(1).get());	
	}

@Test
@Order(2)
public void testReadall() {
	List<Admin> list = aRepo.findAll();
	assertThat(list).size().isGreaterThan(0);
}

@Test
@Order(3)
public void testSingleAdmin() {
	Admin admin = aRepo.findById(1).get();
	assertEquals("hyper",admin.getMall());
}

@Test
@Order(4)
public void testUpadate() {
	Admin a = aRepo.findById(1).get();
	a.setMall("bda");
	aRepo.save(a);
	assertNotEquals("forum",aRepo.findById(1).get().getMall());
}

@Test
@Order(5)
public void testDelete() {
	aRepo.deleteById(1);
	assertThat(aRepo.existsById(1)).isFalse();
}
}

	
