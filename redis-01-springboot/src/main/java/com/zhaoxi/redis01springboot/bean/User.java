package com.zhaoxi.redis01springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2020/10/20 0020
 * 陈银杰专属测试
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String name;
    private String passwd;
}
