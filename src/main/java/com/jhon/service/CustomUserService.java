package com.jhon.service;

import com.jhon.entity.SysUser;
import com.jhon.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * <p>功能描述</br> 定义服务 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName CustomUserService
 * @date 2017/9/30 14:33
 */
public class CustomUserService implements UserDetailsService {

	@Autowired
	private SysUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		SysUser user = userRepository.findByUsername(s);
		if(user == null){
			throw new UsernameNotFoundException("用户名不存在");
		}
		System.out.println("s:"+s);
		System.out.println("username:"+user.getUsername()+";password:"+user.getPassword());
		return user;
	}
}
