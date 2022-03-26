package fis.fresher.java.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "account_number")
	private String accountNumber;
	@Column(name = "account_name")
	private String accountName;
	@Column(name = "blance")
	private double balance;
	@Column(name = "status")
	private int status;
	
}
