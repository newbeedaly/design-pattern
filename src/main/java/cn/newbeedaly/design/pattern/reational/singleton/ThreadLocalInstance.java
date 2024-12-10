package cn.newbeedaly.design.pattern.reational.singleton;

/**
 * 线程唯一的单例模式 （ThreadLocal）
 * @author newbeedaly
 * @date 2023-07-04
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> THREAD_LOCAL_INSTANCE_THREAD_LOCAL = ThreadLocal.withInitial(ThreadLocalInstance::new);

    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return THREAD_LOCAL_INSTANCE_THREAD_LOCAL.get();
    }

}
