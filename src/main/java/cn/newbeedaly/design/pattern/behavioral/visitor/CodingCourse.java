package cn.newbeedaly.design.pattern.behavioral.visitor;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class CodingCourse extends Course {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisistor visistor) {
        visistor.visit(this);
    }

}
