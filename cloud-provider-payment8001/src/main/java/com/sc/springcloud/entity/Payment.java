package com.sc.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 付款
 *
 * @author 沈陈
 * @date 2020/10/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private static final long serialVersionUID = 4930979014928529323L;

    private Long id;
    private String serial;

}
