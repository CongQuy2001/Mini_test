package fis.fresher.java.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fis.fresher.java.jpa.entity.Account;
@Repository
public interface Accountrepository extends JpaRepository<Account, Long> {

}
