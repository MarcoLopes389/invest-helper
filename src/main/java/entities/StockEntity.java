package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "stock")
public class StockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Column
    String name;

    @Column
    String symbol;

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

    public StockEntity() {}

    public StockEntity(String id, String name, String symbol, Double pl, Double roe, Double roic, Double roa, Double dividendYeld) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.pl = pl;
        this.roe = roe;
        this.roa = roa;
        this.dividendYeld = dividendYeld;
        this.roic = roic;
    }
}
