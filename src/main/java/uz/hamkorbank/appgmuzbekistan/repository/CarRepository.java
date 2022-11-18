package uz.hamkorbank.appgmuzbekistan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.hamkorbank.appgmuzbekistan.entity.Car;


/**
 * Author: khamza@nightwell-logistics.com
 * Date: 2/1/2022
 * Time: 7:33 PM
 */

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
