package org.easymis.base.gateway.dynamic.entity;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @ClassName: GatewayFilterDefinition
 * @Description: TODO(过滤器模型)
 * @author lenovo-t
 * @date 2019年5月22日
 *
 */
public class GatewayFilterDefinition {
	// Filter Name
	private String name;
	// 对应的路由规则
	private Map<String, String> args = new LinkedHashMap<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getArgs() {
		return args;
	}

	public void setArgs(Map<String, String> args) {
		this.args = args;
	}
}
