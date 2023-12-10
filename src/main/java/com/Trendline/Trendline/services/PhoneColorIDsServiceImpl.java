package com.Trendline.Trendline.services;

import com.Trendline.Trendline.entity.PhoneColorIDs;
import com.Trendline.Trendline.repositories.PhoneColorIDsRepo;
import com.Trendline.Trendline.services.color.ColorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class PhoneColorIDsServiceImpl extends GenericServiceImpl<PhoneColorIDs>  {
    PhoneColorIDsRepo repository ;
    @Autowired

    private ColorServiceImpl colorService;
    @Autowired
    public PhoneColorIDsServiceImpl(PhoneColorIDsRepo repository) {
        super(repository);
        this.repository = repository ;

    }

    public List<Integer> getColorIdsByPhoneId(int phoneId) {
        return this.repository.findByPhoneId(phoneId).stream()
                .map(PhoneColorIDs::getColorId)
                .collect(Collectors.toList());
    }

    public List<String> getColorCodesByPhoneId(int phoneId) {
        List<Integer> colorIds = getColorIdsByPhoneId(phoneId);
        return colorService.getColorCodesByColorIds(colorIds);
    }

}