package com.Trendline.Trendline.services.color;

import com.Trendline.Trendline.entity.Color;
import com.Trendline.Trendline.services.GenericService;

import java.util.List;

public interface ColorService extends GenericService<Color> {
      List<String> getColorCodesByColorIds(List<Integer> colorIds);
}