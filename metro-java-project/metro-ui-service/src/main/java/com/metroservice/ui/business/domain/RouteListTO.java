package com.metroservice.ui.business.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

//@Getter @Setter 
@Data
public class RouteListTO {
	private List<RouteTO> routeList = new ArrayList<RouteTO>();

//    public List<RouteTO> getRouteList() { 
//		return routeList;
//	}
//	public void setRouteList(List<RouteTO> routeList) { 
//		this.routeList = routeList;
//	}
}
