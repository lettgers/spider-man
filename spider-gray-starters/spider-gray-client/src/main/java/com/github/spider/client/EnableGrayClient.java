package com.github.spider.client;

import java.lang.annotation.*;

/**
 * 启用灰度客户端
 * @Author: lettger
 * @Date: 2021/6/5 11:06 上午
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(GrayClientImportSelector.class)
public @interface EnableGrayClient {
}
