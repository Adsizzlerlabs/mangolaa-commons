package com.adsizzler.mangolaa.commons.json.jackson.deserializers;

import com.adsizzler.mangolaa.commons.domain.openrtb.enums.MediaRating;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * Created by Ankush on 26/07/17.
 */
public class MediaRatingDeserializer extends JsonDeserializer<MediaRating> {

    @Override
    public MediaRating deserialize(
            final JsonParser parser,
            final DeserializationContext ctxt
    ) throws IOException
    {
        return MediaRating.from(parser.getValueAsInt());
    }

}
