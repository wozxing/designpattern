package prototype;


import java.io.*;

public class DeepTrade implements Serializable {


    private String tradeNo;

    private CashFlow cf;

    public DeepTrade() {
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

    protected Object deepClone() {

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(this);
            oos.flush();
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            DeepTrade clone = (DeepTrade)ois.readObject();

            return clone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
