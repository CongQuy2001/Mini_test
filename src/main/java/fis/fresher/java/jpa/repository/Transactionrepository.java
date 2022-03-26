package fis.fresher.java.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fis.fresher.java.jpa.entity.Transaction;

@Repository
public interface Transactionrepository extends JpaRepository<Transaction, Long>{

}
