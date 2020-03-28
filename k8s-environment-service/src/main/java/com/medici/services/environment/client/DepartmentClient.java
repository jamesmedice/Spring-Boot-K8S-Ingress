package com.medici.services.environment.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "department")
public interface DepartmentClient extends BaseFeignClient {

}
