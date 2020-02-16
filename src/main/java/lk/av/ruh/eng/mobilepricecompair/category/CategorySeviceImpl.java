package lk.av.ruh.eng.mobilepricecompair.category;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorySeviceImpl implements CategoryService {
    @Autowired
    private CategoryResourse categoryResourse;
    @Override
    public Response get() {
        List<BrandEntity> brandEntities = categoryResourse.get();

        return new Response("successfull",brandEntities);
    }
}
