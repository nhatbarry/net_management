package entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "computer")
@XmlAccessorType(XmlAccessType.FIELD)

public class Computer implements Serializable{
    private int Id;
    private String model;
    private boolean isUsed;
    private double price;
    private String clientName;
    private double usedTime;
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public double getUsedTime() {
        return usedTime;
    }
    public void setUsedTime(double usedTime) {
        this.usedTime = usedTime;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public boolean isUsed() {
        return isUsed;
    }
    public void setUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}
