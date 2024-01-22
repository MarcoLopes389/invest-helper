package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Column
    String name;

    @Column
    Double pl;

    @Column
    Double roe;

    @Column
    Double roic;

    @Column
    Double roa;

    @Column
    Double dividendYeld;

    public Stock(String id, String name, Double pl, Double roe, Double roic, Double roa, Double dividendYeld) {
        this.id = id;
        this.name = name;
        this.pl = pl;
        this.roe = roe;
        this.roa = roa;
        this.dividendYeld = dividendYeld;
        this.roic = roic;
    }
}
