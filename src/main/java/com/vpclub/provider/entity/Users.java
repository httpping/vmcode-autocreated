package com.vpclub.provider.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableLogic;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author tp
 * @since 2017-11-08
 */
@Data
@Accessors(chain = true)
@TableName("tab_users")
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	private Integer age;
	@TableField("area_ap")
	private String areaAp;
	private String name;
	@TableField("store_id")
	private Integer storeId;
	/**
	 * 删除标记(1：在线，2：删除)
	 */
    @TableLogic
	private Integer deleted;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
