package cn.newbeedaly.design.principle.liskovsubstitution;

/**
 * 里氏替换原则 子类出现的地方，基类可以替代。
 * 如：获取正方形和长方形的长高，求面积时，调用子类的地方，都可以使用父类代替。
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Test {

    public static void main(String[] args) {
        Quadrangle square = new Square(10L);
        System.out.println("正方形的面积：" + (square.getLength() * square.getWidth()));
        Quadrangle rectangle = new Rectangle(8L, 10L);
        System.out.println("长方形的面积：" + (rectangle.getLength() * rectangle.getWidth()));
    }

}
