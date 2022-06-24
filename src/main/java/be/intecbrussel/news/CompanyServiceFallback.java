package be.intecbrussel.news;

import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CompanyServiceFallback implements CompanyService {

    @Override
    public CollectionModel<Company> findAll() {
        return CollectionModel.of(Arrays.asList(new Company("vaadin"), new Company("pivotal"), new Company("netflix")));
    }

}
