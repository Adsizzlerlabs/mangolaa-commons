package com.adsizzler.mangolaa.json.jackson.deserializers;

import com.adsizzler.mangolaa.domain.openrtb.enums.ProductionQuality;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * Created by Ankush on 26/07/17.
 */
public class ProductionQualityDeserializer extends JsonDeserializer<ProductionQuality>{

    @Override
    public ProductionQuality deserialize(
            final JsonParser parser,
            final DeserializationContext ctxt
    )throws IOException
    {
        return ProductionQuality.from(parser.getValueAsInt());
    }

}
