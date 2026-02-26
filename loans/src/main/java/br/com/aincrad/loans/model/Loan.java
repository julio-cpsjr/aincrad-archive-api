package br.com.aincrad.loans.model;


import jakarta.persistence.*;

@Entity
public class Loan {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titleBook;
    private String username;
    private String amountBook;

    @Enumerated
    private StatusLoan statusLoan;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAmountBook() {
        return amountBook;
    }

    public void setAmountBook(String amountBook) {
        this.amountBook = amountBook;
    }

    public StatusLoan getStatusLoan() {
        return statusLoan;
    }

    public void setStatusLoan(StatusLoan statusLoan) {
        this.statusLoan = statusLoan;
    }
}
