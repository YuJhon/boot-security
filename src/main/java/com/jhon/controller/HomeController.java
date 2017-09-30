package com.jhon.controller;

import com.jhon.dto.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>功能描述</br> 控制器 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName HomeController
 * @date 2017/9/30 14:46
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model){
		Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
		model.addAttribute("msg", msg);
		return "index";
	}
}
