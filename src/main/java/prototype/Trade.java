package prototype;

public class Trade implements Cloneable{

    private String tradeNo;

    private CashFlow cf;

    public Trade() {
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public CashFlow getCf() {
        return cf;
    }

    public void setCf(CashFlow cf) {
        this.cf = cf;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
