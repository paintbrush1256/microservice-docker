package com.metroservice.route.web.service;

import com.metroservice.route.business.domain.RouteTO;
import com.metroservice.route.business.domain.RouteListTO;
import com.metroservice.route.business.service.RouteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class RouteServiceController {

    @Autowired
    private RouteService routeService;
    //------------------------------------------------------------------------------------------------------------------------------
    @RequestMapping(method= RequestMethod.GET, value="/route/all")
    public RouteListTO getAllRoutes() throws Exception {
		try {
			List<RouteTO> routes = this.routeService.getAllRoutes();
			RouteListTO rtoList = new RouteListTO();
			rtoList.setRouteList(routes);
			System.out.println("RouteServiceController.getAllRoutes() ***routes="+routes);
			return rtoList;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
    }
    //------------------------------------------------------------------------------------------------------------------------------
    @RequestMapping(method= RequestMethod.GET, value="/route/{id}")
    public RouteTO getRouteById(@PathVariable(value="id")String id) throws Exception {
		RouteTO route = this.routeService.getRouteById(Long.valueOf(id));
		System.out.println("RouteServiceController.getRouteById() ***route="+route);
        return route;
    }
    //------------------------------------------------------------------------------------------------------------------------------
    @RequestMapping(method= RequestMethod.POST, value="/route/save")
    public void saveRoute(@RequestBody RouteTO routeTO) throws Exception {
		System.out.println("RouteServiceController.saveRoute():***routeTO="+routeTO);
		RouteTO dto = this.routeService.saveRoute(routeTO);
		System.out.println("RouteServiceController.saveRoute():***dto="+dto);
    }
    //------------------------------------------------------------------------------------------------------------------------------
    @RequestMapping(method= RequestMethod.DELETE, value="/route/{id}")
    public void deleteRoute(@PathVariable(value="id")String id) throws Exception {
		System.out.println("RouteServiceController.deleteRoute():***id="+id);
		this.routeService.deleteRoute(Long.valueOf(id));
		System.out.println("RouteServiceController.deleteRoute():***dto=");
    }
    //------------------------------------------------------------------------------------------------------------------------------
    @RequestMapping(method= RequestMethod.DELETE, value="/route/deleteAll")
    public void deleteAllRoutes() throws Exception {
		System.out.println("RouteServiceController.deleteAllRoutes().enter");
		this.routeService.deleteAllRoutes();
		System.out.println("RouteServiceController.deleteAllRoutes().exit");
    }
    //------------------------------------------------------------------------------------------------------------------------------
//    @RequestMapping(value = "/train/trainId/{trainId}", method = RequestMethod.DELETE)
//    public void deleteTrainByTrainId(@PathVariable(value="trainId")String trainId) throws Exception {
//		trainService.deleteTrainByTrainId(Long.valueOf(trainId));
//	}
    //------------------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------------------
    
    public RouteListTO getAllRoutesFallBack() {
    	//get Route details from cache.
    	RouteListTO rtoList = new RouteListTO();
    	List<RouteTO> returnRoutes = new ArrayList<>();
    	
    	RouteTO to = new RouteTO();
		to.setRouteNumber      ("FallBack-1");
		to.setStartingStationId(1111111);
		to.setEndStationId     (1111111);
		to.setLastModifiedDate (new Date());
		returnRoutes.add(to);
		
		to = new RouteTO();
		to.setRouteNumber      ("FallBack-2");
		to.setStartingStationId(1111111);
		to.setEndStationId     (1111111);
		to.setLastModifiedDate (new Date());
		returnRoutes.add(to);
		
		rtoList.setRouteList(returnRoutes);
		
		return rtoList;
		
	}
    
}
