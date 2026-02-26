package br.com.aincrad.loans.repository;

import br.com.aincrad.loans.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
