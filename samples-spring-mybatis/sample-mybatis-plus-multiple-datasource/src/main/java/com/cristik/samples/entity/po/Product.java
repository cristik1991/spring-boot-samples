package com.cristik.samples.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author zhenghua.ni
 */
@Data
@Builder
@Accessors(chain = true)
@TableName("pro_product")
public class Product {

    @TableId(value = "product_id",type = IdType.AUTO)
    private Long productId;

    @TableField(value = "product_name")
    private String productName;

    @TableField(value = "product_code")
    private String productCode;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "create_by")
    private Long createBy;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "update_by")
    private Long updateBy;

}
