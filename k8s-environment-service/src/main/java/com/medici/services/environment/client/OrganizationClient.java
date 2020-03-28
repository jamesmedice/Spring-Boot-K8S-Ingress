package com.medici.services.environment.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "organization")
public interface OrganizationClient extends BaseFeignClient {

}
