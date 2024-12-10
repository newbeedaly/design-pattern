package cn.newbeedaly.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class ArticleMememtoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento() {
        return ARTICLE_MEMENTO_STACK.pop();
    }

    public void addMemento(ArticleMemento articleMemento) {
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
