package com.sushuzhuang.blogs.vo;

import java.util.List;

/**
 * 含子集的k-v结构
 *
 * @author shuzhuang.su
 * @date 2020-06-01 17:25
 */
public class KVChildren<K, V>{


    private K key;
    private V value;

    private List<KVChildren> children;

    public KVChildren() {
    }

    public KVChildren(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public List<KVChildren> getChildren() {
        return children;
    }

    public void setChildren(List<KVChildren> children) {
        this.children = children;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
