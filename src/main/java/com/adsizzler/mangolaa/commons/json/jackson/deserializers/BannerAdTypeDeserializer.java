package com.adsizzler.mangolaa.commons.json.jackson.deserializers;

import com.adsizzler.mangolaa.commons.domain.openrtb.enums.BannerAdType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * Created by Ankush on 19/07/17.
 */
public class BannerAdTypeDeserializer extends JsonDeserializer<BannerAdType> {

    @Override
    public BannerAdType deserialize(
            final JsonParser parser,
            final DeserializationContext ctxt
    ) throws IOException
    {
        return BannerAdType.from(parser.getValueAsInt());
    }

}
