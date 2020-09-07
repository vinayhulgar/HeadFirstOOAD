
public class Guitar{

private String serialNumber, model;
Builder builder;
Type type;
private double price;
Wood topWood;
Wood backWood;

public Guitar(String serialNumber, double price, Builder builder, 
String model, Type type,
Wood backWood, Wood topWood){
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
}

public Builder getBuilder() {
    return builder;
}

public void setBuilder(Builder builder) {
    this.builder = builder;
}

public String getSerialNumber() {
    return serialNumber;
}

public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public Type getType() {
    return type;
}

public void setType(Type type) {
    this.type = type;
}

public Wood getBackWood() {
    return backWood;
}

public void setBackWood(Wood backWood) {
    this.backWood = backWood;
}

public Wood getTopWood() {
    return topWood;
}

public void setTopWood(Wood topWood) {
    this.topWood = topWood;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}





}