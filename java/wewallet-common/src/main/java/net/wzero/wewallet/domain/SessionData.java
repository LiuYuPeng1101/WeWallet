package net.wzero.wewallet.domain;

import java.util.UUID;

/**
 * session 设计 说明
 * 没有登陆用户和当前用户的说法了
 * 1、账户，表示用来登陆的账户
 * 2、用户（客户） 用来表示当前操作的人
 * 3、不存member和customer 太大了，存个id 自己去取吧
 * @author yjjie
 *
 */
public class SessionData extends SessionBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8063731318979869188L;
	/**
	 * -----------系统 参数------------
	 */
	private String token;//token 用户标识
	private int clientId;// 客户端ID
	private int departmentId; // 部门ID
	/**
	 * -------------账户信息-----------
	 */
	private int loginType;//微信，小程序，phone,account
	private MemberInfo member;
	/**
	 * -----------微信专区---------------
	 */
	private String wxSessionKey;
	
	
	public String getToken() {
		if(token == null)
			token = UUID.randomUUID().toString();
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getLoginType() {
		return loginType;
	}
	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}
	public String getWxSessionKey() {
		return wxSessionKey;
	}
	public void setWxSessionKey(String wxSessionKey) {
		this.wxSessionKey = wxSessionKey;
	}
	public MemberInfo getMember() {
		return member;
	}
	public void setMember(MemberInfo member) {
		this.member = member;
	}
}
