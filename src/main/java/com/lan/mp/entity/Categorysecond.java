package com.lan.mp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lan
 * @since 2020-06-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Categorysecond implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "csid", type = IdType.AUTO)
    private Integer csid;

    private String csname;

    private Integer cid;


}
