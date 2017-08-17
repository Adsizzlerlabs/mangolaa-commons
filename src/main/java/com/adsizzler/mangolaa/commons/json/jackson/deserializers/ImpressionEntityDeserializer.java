package com.adsizzler.mangolaa.commons.json.jackson.deserializers;

import com.adsizzler.mangolaa.commons.domain.openrtb.enums.ImpressionEntity;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * Created by Ankush on 01/08/17.
 */
public class ImpressionEntityDeserializer extends JsonDeserializer<ImpressionEntity> {

    @Override
    public ImpressionEntity deserialize(
            final JsonParser parser,
            final DeserializationContext ctxt
    )throws IOException
    {
        return ImpressionEntity.from(parser.getValueAsInt());
    }

}
