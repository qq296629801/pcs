package cn.ymsys.service;

import java.sql.SQLException;

import cn.ymsys.dao.imp.AdminDaoImpl;
import cn.ymsys.model.Admin;
import cn.ymsys.util.MD5Util;

public class AdminService extends BaseService {
	private AdminDaoImpl dao = new AdminDaoImpl();

	public static void main(String[] args) throws SQLException {
		BaseService baseService = BaseService.getInstance();

		Admin admin = new Admin();
		admin.setUser_name("admin");
		// baseService.add(admin);
		// baseService.findAll(new Admin());

		AdminService adminService = new AdminService();
		admin = adminService.find("admmin", MD5Util.md5Hex("admin"));
		System.err.println(admin.getNick_name() + " " + adminService.check("asds"));
	}

	public Admin find(String name, String passwd) throws SQLException {
		return dao.find(name, passwd);
	}

	public boolean check(String name) throws SQLException {
		return dao.findUserName(name);
	}
}
