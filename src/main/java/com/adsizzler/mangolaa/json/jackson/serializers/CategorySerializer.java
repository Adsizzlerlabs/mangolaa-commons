package com.adsizzler.mangolaa.json.jackson.serializers;

import com.adsizzler.mangolaa.domain.openrtb.enums.Category;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Objects;

/**
 * Created by Ankush on 04/08/17.
 */
public class CategorySerializer extends JsonSerializer<Category> {

    @Override
    public void serialize(
            final Category category,
            final JsonGenerator gen,
            final SerializerProvider serializers
    )
    throws IOException
    {
        if(Objects.nonNull(category)){
            gen.writeString(category.getCode());
        }
    }
}
