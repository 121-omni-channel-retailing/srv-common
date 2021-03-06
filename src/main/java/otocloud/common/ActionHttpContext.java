/*
 * Copyright (C) 2015 121Cloud Project Group  All rights reserved.
 */
package otocloud.common;

/**
 * TODO: DOCUMENT ME!
 * @date 2015年6月20日
 * @author lijing@yonyou.com
 */
public class ActionHttpContext {
	//HTTP头参数
	public static final String ACCOUNT_KEY = "account";//当前账户
	public static final String T_ACCOUNT_KEY = "target_account";//目标账户		
	public static final String ACTOR_KEY = "actor";//操作员
	public static final String TOKEN_KEY = "access_token";//访问token
	// contex中一定要有四个字段，格式：“{account}|{target_account}|{actor}|{access_token}”，如果没有值可以空着，如：“33||1310233999|”
	public static final String CONTEXT_KEY = "context";//context 上下文
	public static final String SPLIT_KEY = "\\|";//context的分割符
	
	//----------------
	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * @return the targetAccount
	 */
	public String getTargetAccount() {
		return targetAccount;
	}
	/**
	 * @param targetAccount the targetAccount to set
	 */
	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
	}
	/**
	 * @return the actor
	 */
	public String getActor() {
		return actor;
	}
	/**
	 * @param actor the actor to set
	 */
	public void setActor(String actor) {
		this.actor = actor;
	}
	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}
	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	private String account = "";
	private String targetAccount = "";
	private String actor = "";
	private String accessToken = "";
	
}
