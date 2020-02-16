package lk.av.ruh.eng.mobilepricecompair.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class CategoryResourseImpl implements CategoryResourse {
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public List<BrandEntity> get() {
        Iterable<BrandEntity> all = categoryRepo.findAll();
        List<BrandEntity> bnch = new ArrayList<>();

        all.forEach(bnch::add);
        return bnch;
    }
}
