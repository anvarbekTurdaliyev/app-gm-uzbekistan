package uz.hamkorbank.appgmuzbekistan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.hamkorbank.appgmuzbekistan.entity.District;


/**
 * Author: khamza@nightwell-logistics.com
 * Date: 2/1/2022
 * Time: 7:33 PM
 */

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {
}
