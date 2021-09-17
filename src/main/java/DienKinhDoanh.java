public class DienKinhDoanh extends Dien{

    private long tongTien;
    private long soTien;

    public DienKinhDoanh(EnumDienKinhDoanh type) {
        switch (type){
            case CAO_AP:
            {
                this.soTien = 2442;
                break;
            }
            case TRUNG_AP:
            {
                this.soTien = 2629;
                break;
            }
            default: {
                this.soTien = 2666;
                break;
            }
        }
    }


    @Override
    public void inputKV() {
        super.inputKV();
        this.tongTien = numberKV * this.soTien;
    }

    @Override
    public long tongTien() {
        return this.tongTien;
    }




}
