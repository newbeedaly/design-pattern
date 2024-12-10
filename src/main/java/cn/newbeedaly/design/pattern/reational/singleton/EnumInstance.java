package cn.newbeedaly.design.pattern.reational.singleton;

/**
 * 枚举
 *
 * @author newbeedaly
 * @date 2023-07-04
 */
public enum EnumInstance {

    // 枚举实例
    INSTANCE {
        @Override
        protected void print(){
            System.out.println("测试打印方法");
        }
    };

    protected abstract void print();

    /**
     * 枚举属性
     */
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
