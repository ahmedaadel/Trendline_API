package com.Trendline.Trendline.services.color;

import com.Trendline.Trendline.entity.Color;
import com.Trendline.Trendline.repositories.ColorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ColorServiceImpl implements ColorService {

    private final ColorRepo repository;

    @Autowired
    public ColorServiceImpl(ColorRepo colorRepo) {
        this.repository = colorRepo;
    }


    @Override
    public List<Color> findAll() {
        return repository.findAll();
    }

    @Override
    public Color findById(int id) {
        Optional<Color> optional = repository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Color saveItem(Color item) {
        return repository.save(item);
    }

    @Override
    public void deleteItem(int id) {
        repository.deleteById(id);
    }

    public  List<String> getColorCodesByColorIds(List<Integer> colorIds) {
        return repository.findAllById(colorIds).stream()
                .map(Color::getColorCode)
                .collect(Collectors.toList());
    }

}
