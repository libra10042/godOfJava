package ch27.objectOutputStream_objectInputStream;

import java.io.Serializable;

public class SerialDTO implements Serializable {
    static final long serialVersionUID = 1L;
    private String bookType = "IT";
    private String bookName;
    transient private int bookOrder;
    private boolean bestSeller;
    private long soldPerDay;

    public SerialDTO(String bookType, String bookName, int bookOrder, boolean bestSeller, long soldPerDay) {
        super();
        this.bookType = bookType;
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bestSeller = bestSeller;
        this.soldPerDay = soldPerDay;
    }

    @Override
    public String toString() {
        return "SerialDTO{" +
                "bookType='" + bookType + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookOrder=" + bookOrder +
                ", bestSeller=" + bestSeller +
                ", soldPerDay=" + soldPerDay +
                '}';
    }
}
