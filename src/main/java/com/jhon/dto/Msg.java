package com.jhon.dto;

import lombok.Data;

/**
 * <p>功能描述</br> TODO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName Msg
 * @date 2017/9/30 14:29
 */
@Data
public class Msg {

	private String title;

	private String content;

	private String extraInfo;

	public Msg(String title, String content, String extraInfo) {
		this.title = title;
		this.content = content;
		this.extraInfo = extraInfo;
	}
}
