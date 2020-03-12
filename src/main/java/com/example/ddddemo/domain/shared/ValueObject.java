package com.example.ddddemo.domain.shared;

import java.io.Serializable;

/**
 * @author wy
 * @ProjectName 公牛智能家居云服务平台
 * @Description 值对象
 * @date 2020/3/12 11:24
 */
public interface ValueObject<T> extends Serializable {

    boolean sameValueAs(T other);
}
