/**
 * Copyright (c) 2012 SQLI. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sqli.liferay.imex.core.role.model;

import java.util.LinkedList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

public class Resource {
	
	@Element
	private String resourceName;

	@ElementList(entry="action", inline=true, required=false)
	private LinkedList<Action> actionList = new LinkedList<Action>();
	
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public LinkedList<Action> getActionList() {
		return actionList;
	}
	public void setActionList(LinkedList<Action> actionList) {
		this.actionList = actionList;
	}
	
	
}
