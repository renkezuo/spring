package com.renke.template;

public class IOCBean {
	private MsgBean msgBean;
	
	public MsgBean getMsgBean() {
		return msgBean;
	}

	public void setMsgBean(MsgBean msgBean) {
		this.msgBean = msgBean;
	}

	public void callMsg(String msg){
		msgBean.showMsg(msg);
	}
}
