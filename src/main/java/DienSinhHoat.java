public class DienSinhHoat extends Dien{

    private BacDien[] bac;
    private long[] tienTheoBac;
    private int soBac;
    private long tongTien;

    public DienSinhHoat(EnumDienSinhHoat type) {

        this.soBac = 6;
        this.tongTien = 0;
        this.bac = new BacDien[this.soBac];
        this.tienTheoBac = new long[this.soBac];

        switch (type)
        {
            case GIA_LE:
            {
                this.bac[0] = new BacDien(1,1678,0, 50);
                this.bac[1] = new BacDien(2,1734,51,100);
                this.bac[2] = new BacDien(3,2014,101, 200);
                this.bac[3] = new BacDien(4,2536,201, 300);
                this.bac[4] = new BacDien(5,2834,301,400);
                this.bac[5] = new BacDien(6,2927, 401,null);
                break;
            }
            default: {
                this.bac[0] = new BacDien(1,1403,0, 50);
                this.bac[1] = new BacDien(2,1459,51,100);
                this.bac[2] = new BacDien(3,1590,101, 200);
                this.bac[3] = new BacDien(4,1971,201, 300);
                this.bac[4] = new BacDien(5,2231,301,400);
                this.bac[5] = new BacDien(6,2323, 401,null);
                break;
            }
        }

        for(int i = 0; i<this.soBac; i++)
        {
            this.tienTheoBac[i] = 0;
        }

    }


    public BacDien[] getBac() {
        return bac;
    }

    public void setBac(BacDien[] bac) {
        this.bac = bac;
    }

    public void calculateLevel()
    {
        for(int i = 0; i < this.soBac; i++)
        {

            BacDien bacdien = this.bac[i];
            if(this.numberKV < bacdien.getChiSoMin())
            {
                break;
            }
            int soSuDung;
            if(null != bacdien.getChiSoMax()) {
                if (this.numberKV < bacdien.getChiSoMax()) {
                    soSuDung = this.numberKV - bacdien.getChiSoMin();
                } else {
                    soSuDung = bacdien.getChiSoMax() - bacdien.getChiSoMin();
                }
            } else {
                soSuDung = this.numberKV - bacdien.getChiSoMin();
            }

            this.tienTheoBac[i] = soSuDung * bacdien.getPrice() ;
            this.tongTien+=this.tienTheoBac[i];
        }
    }

    public long tongTien() {
        return this.tongTien;
    }

    @Override
    public void inputKV() {
        super.inputKV();
        calculateLevel();
    }

}
