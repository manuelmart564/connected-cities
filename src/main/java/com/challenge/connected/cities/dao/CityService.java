package com.challenge.connected.cities.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CityService {


import org.apache.commons.lang3.StringUtils;

    public class Test {
        static Set<String> set = new HashSet<String>();
        static Map<String, List<String>> custommisedRoutes = new HashMap<String, List<String>>();

        /**
         * this follows o(n)
         * create a map by using the defined list of routes
         * iterate the map and create a set of all possible combination of routes
         * then verify if the set contains the input origin & destination.
         *
         * @param origin
         * @param destination
         * @return
         */
        public static boolean isRouteValid(String origin, String destination) {
            String[] routesList = {"BOS-JFK", "BOS-BVRM", "BOS-MCO","DEL-HYD","PUNE-PUNE","BOS-DEL"};

            for(String route : routesList) {
                String[] routes = route.split("-");
                if(custommisedRoutes.containsKey(routes[0])) {
                    List<String> list = custommisedRoutes.get(routes[0]);
                    list.add(routes[1]);
                } else {
                    List<String> list = new ArrayList<String>();
                    list.add(routes[1]);
                    custommisedRoutes.put(routes[0], list);
                }
            }
            for(String key : custommisedRoutes.keySet()) {
                List<String> list = custommisedRoutes.get(key);
                routeClaculate(key, list, new ArrayList<String>());
            }
            System.out.println(set);
            return set.contains(origin.concat("-").concat(destination)) || set.contains(destination.concat("-").concat(origin));
        }


        static void  routeClaculate(String mainKey, List<String> list, List<String> visited) {
            for(String value : list) {
                if(!StringUtils.equals(mainKey, value)&& !visited.contains(value)) {
                    set.add(mainKey+"-"+value);
                    visited.add(value);
                    if(custommisedRoutes.containsKey(value)) {
                        routeClaculate(mainKey, custommisedRoutes.get(value),  visited);
                    }
                }
            }
        }

        public static void main(String[] args) {
            System.out.println(isRouteValid("MCO", "BOS"));
        }

    }
}
