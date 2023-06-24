package com.eazybytes.accounts.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.eazybytes.accounts.entity.Accounts;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

	Optional<Accounts> findByCustomerId(Long customerId);

	@Transactional
	@Modifying
	void deleteByCustomerId(Long customerId);

}
