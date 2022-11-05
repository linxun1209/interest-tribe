package com.xingchen.friends.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xingchen
 * @version V1.0
 *
 * 通用删除请求
 *
 * @Package com.xingchen.friends.model.request
 * @date 2022/10/31 20:22
 */
@Data
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = -5860707094194210842L;

    private long id;
}