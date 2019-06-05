/**
 * 项目名称：quickstart-spring-cloud-sleuth-trace1 
 * 文件名：TagSampler.java
 * 版本信息：
 * 日期：2018年5月18日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.spring.cloud.sleuth.trace1;

import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.Span;

/**
 * TagSampler 
 *  
 * @author：youngzil@163.com
 * @2018年5月18日 下午12:59:39 
 * @since 1.0
 */
public class TagSampler implements Sampler {

    private String tag;

    public TagSampler(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean isSampled(Span span) {
        return span.tags().get(tag) != null;
    }
}
