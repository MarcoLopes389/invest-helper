package core.entities;

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
    Double price;

    @Column
    Double lpa;

    @Column
    Double netMargin;

    @Column
    Double vpa;

    @Column
    Double payout;

    @Column
    Double evEbitda;

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

    @Column
    Double pvp;

    @Column
    Double cagr;

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

    public Double getPvp() {
        return pvp;
    }

    public void setPvp(Double pvp) {
        this.pvp = pvp;
    }

    public Double getCagr() {
        return cagr;
    }

    public void setCagr(Double cagr) {
        this.cagr = cagr;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getLpa() {
        return lpa;
    }

    public void setLpa(Double lpa) {
        this.lpa = lpa;
    }

    public Double getNetMargin() {
        return netMargin;
    }

    public void setNetMargin(Double netMargin) {
        this.netMargin = netMargin;
    }

    public Double getVpa() {
        return vpa;
    }

    public void setVpa(Double vpa) {
        this.vpa = vpa;
    }

    public Double getPayout() {
        return payout;
    }

    public void setPayout(Double payout) {
        this.payout = payout;
    }

    public Double getEvEbitda() {
        return evEbitda;
    }

    public void setEvEbitda(Double evEbitda) {
        this.evEbitda = evEbitda;
    }

    public Double getPl() {
        return pl;
    }

    public void setPl(Double pl) {
        this.pl = pl;
    }

    public Double getRoe() {
        return roe;
    }

    public void setRoe(Double roe) {
        this.roe = roe;
    }

    public Double getRoic() {
        return roic;
    }

    public void setRoic(Double roic) {
        this.roic = roic;
    }

    public Double getRoa() {
        return roa;
    }

    public void setRoa(Double roa) {
        this.roa = roa;
    }

    public Double getDividendYeld() {
        return dividendYeld;
    }

    public void setDividendYeld(Double dividendYeld) {
        this.dividendYeld = dividendYeld;
    }
}
