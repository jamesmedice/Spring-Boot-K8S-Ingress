package com.medici.services.environment.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "admin")
public interface AdminClient extends BaseFeignClient {

}
