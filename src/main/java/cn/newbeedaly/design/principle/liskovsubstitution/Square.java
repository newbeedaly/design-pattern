package cn.newbeedaly.design.principle.liskovsubstitution;

/**
 * 正方形
 *
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Square implements Quadrangle {

    private Long sideLength;

    public Square() {
    }

    public Square(Long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public Long getWidth() {
        return sideLength;
    }

    @Override
    public Long getLength() {
        return sideLength;
    }
}
