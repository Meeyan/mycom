package com.acom.services.sv;

import com.acom.entities.model.AdminUser;
import com.acom.entities.model.Privilege;

import java.util.List;

/**
 *
 */
public interface IAdminUserService {
    /**
     * 查询管理员
     *
     * @param userId 管理员id
     * @return
     * @author zhaojy
     * @createTime 2017-06-06
     */
    public AdminUser getAdminUserById(int userId);

    /**
     * 根据密码和用户名查询用户
     *
     * @param userName
     * @param passWd
     * @return
     */
    public AdminUser getAdminUserByNameAndPwd(String userName, String passWd);

    /**
     * 新增管理员账号
     *
     * @param adminUser 管理用户
     * @return
     * @author zhaojy
     * @createTime 2017-06-06
     */
    public boolean addAdminUser(AdminUser adminUser);

    public List<Privilege> getAllPrivileges();
}
