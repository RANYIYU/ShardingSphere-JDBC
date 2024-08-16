package com.ryy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @TableName testbroadcast
 */
@TableName(value ="testbroadcast")
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Testbroadcast implements Serializable {
    private Long id;

    private String name;

    private static final long serialVersionUID = 1L;
}