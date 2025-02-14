package com.kh.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		String remoteAddr = sre.getServletRequest().getRemoteAddr();

		System.out.println(remoteAddr + "�� ���� ��û�� ���۵�!!");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		String remoteAddr = sre.getServletRequest().getRemoteAddr();

		System.out.println(remoteAddr + "�� ���� ��û�� �Ҹ��!!");
	}

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("attributeAdded() : " + srae.getName() + ", " + srae.getValue() + " �߰���!!");
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("attributeRemoved() : " + srae.getName() + ", " + srae.getValue() + " ������!!");
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("attributeReplaced() : " + srae.getName() + ", " + srae.getValue() + " ������!!");
	}

}
