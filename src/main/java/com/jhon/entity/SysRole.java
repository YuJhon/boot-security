package com.jhon.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * <p>功能描述</br> TODO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysRole
 * @date 2017/9/30 14:22
 */
@Entity
@Data
public class SysRole {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
}
