package ex0410.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {
	
	/**
	 * 세션이 시작될 때 호출됨
	 * */
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("SessionListener의 sessionCreated");
	}
	
	/**
	 * 세션이 종료될 때 호출됨
	 * : session timeout이 될 때
	 * 	 session.invalidate()가 호출될 때
	 * 	 브라우저의 x를 클릭했을 때는 호출되지 않는다.
	 * */
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("SessionListener의 sessionDestroyed");
	}
	
}
