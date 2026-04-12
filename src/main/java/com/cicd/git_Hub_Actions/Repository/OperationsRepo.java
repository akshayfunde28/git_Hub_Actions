package com.cicd.git_Hub_Actions.Repository;

import com.cicd.git_Hub_Actions.Entities.Operations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationsRepo extends JpaRepository<Operations, Integer> {

}
