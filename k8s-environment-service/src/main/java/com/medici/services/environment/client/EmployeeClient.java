package com.medici.services.environment.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "employee")
public interface EmployeeClient extends BaseFeignClient {

}
