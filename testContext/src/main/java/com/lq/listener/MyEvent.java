package com.lq.listener;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

public class MyEvent extends ApplicationEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public MyEvent(Object source) {
		super(source);
	}
}
