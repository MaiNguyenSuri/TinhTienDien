public class BacDien {
    private int tenBac;
    private long price;
    private Integer chiSoMin;
    private Integer chiSoMax;

    public BacDien(int tenBac, long price, Integer chiSoMin, Integer chiSoMax) {
        this.tenBac = tenBac;
        this.price = price;
        this.chiSoMin = chiSoMin;
        this.chiSoMax = chiSoMax;
    }

    public int getTenBac() {
        return tenBac;
    }

    public void setTenBac(int tenBac) {
        this.tenBac = tenBac;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Integer getChiSoMin() {
        return chiSoMin;
    }

    public void setChiSoMin(Integer chiSoMin) {
        this.chiSoMin = chiSoMin;
    }

    public Integer getChiSoMax() {
        return chiSoMax;
    }

    public void setChiSoMax(Integer chiSoMax) {
        this.chiSoMax = chiSoMax;
    }
}
