/*
 * Copyright (C) 2016 Pivotal Software, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.arsw.myrestaurant.restcontrollers;

import edu.eci.arsw.myrestaurant.beans.impl.BasicBillCalculator;
import edu.eci.arsw.myrestaurant.model.Order;
import edu.eci.arsw.myrestaurant.model.ProductType;
import edu.eci.arsw.myrestaurant.model.RestaurantProduct;
import edu.eci.arsw.myrestaurant.services.OrderServicesException;
import edu.eci.arsw.myrestaurant.services.RestaurantOrderServices;
import edu.eci.arsw.myrestaurant.services.RestaurantOrderServicesStub;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author hcadavid
 */
@RestController
@RequestMapping("/orders")
public class OrdersAPIController {


//    @GetMapping("/order")
//    public Collection<Order> getOrderedDishes() {
//        return orders.values();
//    }

//    @Autowired
//    private BasicBillCalculator calculator;
//
//    @GetMapping("/")
//    public ResponseEntity<Map<Integer, Map<String, Object>>> getAllOrders() {
//        Map<Integer, Map<String, Object>> ordersWithTotal = new HashMap<>();
//        for (Map.Entry<Integer, Order> entry : orders.entrySet()) {
//            int tableNumber = entry.getKey();
//            Order order = entry.getValue();
//            double total = calculator.calculateBill(order, );
//
//            Map<String, Object> orderWithTotal = new HashMap<>();
//            orderWithTotal.put("order", order);
//            orderWithTotal.put("total", total);
//
//            ordersWithTotal.put(tableNumber, orderWithTotal);
//        }
//
//        return new ResponseEntity<>(ordersWithTotal, HttpStatus.OK);
//    }
    @Autowired
    RestaurantOrderServices ans;
    @GetMapping("/peti")
    public ResponseEntity<?> getOrders() throws OrderServicesException {

        return new ResponseEntity<>(ans.getOrders(),HttpStatus.OK);

}
}



