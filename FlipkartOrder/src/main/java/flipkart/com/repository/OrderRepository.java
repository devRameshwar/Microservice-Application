package flipkart.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flipkart.com.model.flipkartOrderDetails;

@Repository
public interface OrderRepository extends JpaRepository<flipkartOrderDetails, Integer> {

}
