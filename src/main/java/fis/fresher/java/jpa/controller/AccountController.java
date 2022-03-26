package fis.fresher.java.jpa.controller;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fis.fresher.java.jpa.entity.Account;
import fis.fresher.java.jpa.sevice.Accountsevice;
import fis.fresher.java.jpa.sevice.IAccountService;
@RestController
@RequestMapping("/account")

public class AccountController {
		@Autowired
		private  IAccountService accountsevice;
		@PostMapping 
		@ResponseBody
	   public ResponseEntity<?> Creat(@RequestBody Account acount) {
		accountsevice.create(acount);
       return new ResponseEntity<String>("create successfully! ",HttpStatus.OK);

		
	}
		@GetMapping(value = "/{id}")
		public ResponseEntity<?> getAccountByID(@PathVariable(name = "id") Long id) {
		
			return new ResponseEntity<Account>(accountsevice.getAccountByID(id), HttpStatus.OK);
		}
		@PutMapping("/{id}")
		
		public ResponseEntity<?> update( @PathVariable(name ="id") Long id, @RequestBody Account acount) {
			acount.setId(id);
			accountsevice.update(acount);
			return new ResponseEntity<String>("update successfully! ",HttpStatus.OK);
			
		}
		@DeleteMapping("/{id}")
		public ResponseEntity<?> delete(@PathVariable(name ="id") Long id ){
		accountsevice.delete(id);
			return new ResponseEntity<String>("delete successfully! ",HttpStatus.OK);
			
		}

	}


