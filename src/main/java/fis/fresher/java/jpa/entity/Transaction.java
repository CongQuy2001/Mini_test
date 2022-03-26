package fis.fresher.java.jpa.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date transactionDate;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fronmAccount",referencedColumnName="id")
	private Account fronmAccount;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "toAccount",referencedColumnName="id")
	private Account toAccount;
	private Double amount;
	private Integer status;
	private String content;
	private String errorReason;

}
