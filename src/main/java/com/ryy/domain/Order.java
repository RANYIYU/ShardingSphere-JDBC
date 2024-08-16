package com.ryy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @TableName order
 */
@TableName(value ="`order`")
@Data
@Accessors(chain = true)
public class Order implements Serializable {
    private Long id;

    private String name;

    private static final long serialVersionUID = 1L;
}