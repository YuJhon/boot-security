package com.jhon.repository;

import com.jhon.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>功能描述</br> 用户查询接口 </p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName SysUserRepository
 * @date 2017/9/30 14:34
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long> {

	SysUser findByUsername(String username);
}
