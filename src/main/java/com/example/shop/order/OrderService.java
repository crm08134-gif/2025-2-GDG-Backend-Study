package com.example.shop.order;

import org.springframework.transaction.annotation.Transactional;
import com.example.shop.order.dto.OrderCreateRequest;
import com.example.shop.order.dto.OrderUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class OrderService {

    private final OrderRepository orderRepository;

    public Long createOrder(OrderCreateRequest request) {
        Order existingOrder = orderRepository.findByLoginId(request.getLoginId());
        if (existingOrder != null) {
            throw new RuntimeException("이미 존재하는 주문입니다: " + request.getLoginId());
        }

        Order order = new Order(
                request.getLoginId(),
                request.getProductName(),
                request.getStockNumber(),
                request.getAddress()
        );

        orderRepository.save(order);

        return  order.getId();
    }

    @Transactional(readOnly = true)
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id){
        Order order = orderRepository.findById(id);

        if (order == null) {
            throw new RuntimeException("주문을 찾을 수 없습니다.");
        }

        return order;
    }

    public void updateOrder(Long id, OrderUpdateRequest request){
        Order order = orderRepository.findById(id);

        if (order == null) {
            throw new RuntimeException("주문을 찾을 수 없습니다.");
        }

        order.updateInfo(request.getLoginId(), request.getProductName(), request.getStockNumber(), request.getAddress);
    }

    public void deleteOrderById(Long id){
        Order order = orderRepository.findById(id);

        if(order == null){
            throw new RuntimeException("주문을 찾을 수 없습니다.");
        }

        orderRepository.deleteById(id);
    }


}