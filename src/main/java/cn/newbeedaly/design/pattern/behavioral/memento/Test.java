package cn.newbeedaly.design.pattern.behavioral.memento;

/**
 * 备忘录模式 保存一个对象的某个状态，以便在适当的时候恢复对象。“后悔药”
 *
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Test {

    public static void main(String[] args) {
        ArticleMememtoManager articleMememtoManager = new ArticleMememtoManager();

        Article article = new Article("设计模式手记A", "手记内容A", "手记图片A");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMememtoManager.addMemento(articleMemento);

        System.out.println("标题:" + article.getTitle() + " 内容:" + article.getContent() + " 图片:" + article.getImgs() + " 暂存成功");
        System.out.println("修改手记start");
        article.setTitle("设计模式手记B");
        article.setContent("手记内容B");
        article.setImgs("手记图片B");
        System.out.println("修改手记end");
        System.out.println("手记完整信息B：" + article);

        articleMemento = article.saveToMemento();
        articleMememtoManager.addMemento(articleMemento);
        article.setTitle("设计模式手记C");
        article.setContent("手记内容C");
        article.setImgs("手记图片C");
        System.out.println("手记完整信息C：" + article);

        System.out.println("暂存回退start");
        System.out.println("回退出栈1次");
        articleMemento = articleMememtoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println("回退出栈1次end 结果：" + article);

        System.out.println("回退出栈2次");
        articleMemento = articleMememtoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println("回退出栈2次end 结果：" + article);
    }

}
