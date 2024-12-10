package cn.newbeedaly.design.principle.liskovsubstitution;

/**
 * 矩形（长方形）
 *
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Rectangle implements Quadrangle {

    private Long length;
    private Long width;

    public Rectangle() {
    }

    public Rectangle(Long length, Long width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Long getWidth() {
        return width;
    }

    @Override
    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public void setWidth(Long width) {
        this.width = width;
    }
}
