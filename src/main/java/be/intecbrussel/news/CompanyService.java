package be.intecbrussel.news;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "${business.name:null}", url = "${business.url:}", fallback = CompanyServiceFallback.class)
@Primary
public interface CompanyService {

    @RequestMapping("/companies")
    CollectionModel<Company> findAll();

}
