package prototype;

import java.io.Serializable;
import java.util.Date;

public class CashFlow implements Serializable {

    private Date paymentDate;

    private Double paymentAmount;

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
