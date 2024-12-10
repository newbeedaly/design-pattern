package cn.newbeedaly.design.principle.interfacesegregation;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Dog implements ISwimAnimalAction,IEatAnimalAction {

    @Override
    public void eat() {
        System.out.println("狗在吃东西");
    }

    @Override
    public void swim() {
        System.out.println("狗在游泳");
    }
}
