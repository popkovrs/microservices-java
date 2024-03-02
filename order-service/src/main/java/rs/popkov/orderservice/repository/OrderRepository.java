package rs.popkov.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.popkov.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
