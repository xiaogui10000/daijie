package org.daijie.core.lock.zk;

/**
 * Created by sunyujia@aliyun.com on 2016/2/25.
 */
public interface DistributedSequence {

    public Long sequence(String sequenceName);
}