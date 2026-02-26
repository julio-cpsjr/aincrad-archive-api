package br.com.aincrad.loans.controller;


import br.com.aincrad.loans.model.Loan;
import br.com.aincrad.loans.service.LoanService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="Loan", description = "Loans Repository")
@RequestMapping("/loans")
public class LoanController {

    public LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping
    public Loan save(@RequestBody Loan loan) {
        return loanService.save(loan);
    }

    @GetMapping
    public List<Loan> findAll() {
        return loanService.findAll();
    }

    @GetMapping("/{id}")
    public Loan findById(@PathVariable Long id) {
        return loanService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        loanService.delete(id);
    }

    @PutMapping("/{id}")
    public Loan update(@PathVariable Long id, @RequestBody Loan loan) {
        return LoanService.update(id,loan);
    }

}
