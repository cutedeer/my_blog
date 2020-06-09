package com.sushuzhuang.blogs.main;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.sushuzhuang.blogs.common.util.JacksonHandler;
import com.sushuzhuang.blogs.vo.KVChildren;
import one.util.streamex.StreamEx;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * cehsi
 *
 * @author shuzhuang.su
 * @date 2020-06-01 18:00
 */
public class Main {

    public static void main(String[] args) {

        List<KVChildren<String,String>> c = Lists.newArrayList(new KVChildren<>("2", "3"), new KVChildren<>("2", "2"), new KVChildren<>("2", "1"));


        StreamEx<Object> empty = StreamEx.empty();

        StreamEx<KVChildren> of = StreamEx.of(c);

//        List<KVChildren> collect = of.distinct(KVChildren::getKey).collect(Collectors.toList());


        List<KVChildren<String, String>> collect = c.stream().
                sorted(Comparator.comparing(KVChildren::getValue)).
                filter(distinctByKey(KVChildren::getKey)).
                collect(Collectors.toList());

        System.out.println(JacksonHandler.toSerialize(collect));

    }


    /**
     * 根据指定列去重
     * 并行流请用ConcurrentHashMap
     */
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new HashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}

