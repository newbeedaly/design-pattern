package cn.newbeedaly.design.pattern.behavioral.templatemethod;

/**
 * 模板方法
 *
 * @author newbeedaly
 * @date 2023-07-05
 */
public abstract class ACourse {

    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }
    final void makeVideo(){
        System.out.println("制作视频");
    }
    final void writeArticle(){
        System.out.println("编写手记");
    }

    /**
     * 钩子方法
     */
    protected boolean needWriteArticle(){
        return false;
    }

    abstract void packageCourse();

}
