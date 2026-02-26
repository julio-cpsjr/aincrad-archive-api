package br.com.aincrad.loans.service;


import br.com.aincrad.loans.model.Loan;
import br.com.aincrad.loans.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoanService {

    private static LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public Loan save(Loan loan) {
        return loanRepository.save(loan);
    }

    public Loan getById(Long id) {
        return loanRepository.findById(id).orElseThrow();
    }
    public List<Loan> findAll() {
        return loanRepository.findAll();
    }
    public void delete(Long id){
        loanRepository.deleteById(id);
    }

    public static Loan update(Long id, Loan loan) {
        loan.setId(id);
        loan.setTitleBook(loan.getTitleBook());
        loan.setUsername(loan.getUsername());
        loan.setAmountBook(loan.getAmountBook());
        return loanRepository.save(loan);
    }
}
