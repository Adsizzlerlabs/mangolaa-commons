package com.adsizzler.mangolaa.commons.json.jackson.deserializers;

import com.adsizzler.mangolaa.commons.domain.openrtb.enums.Context;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * Created by Ankush on 01/08/17.
 */
public class ContextDeserializer extends JsonDeserializer<Context> {

    @Override
    public Context deserialize(
            final JsonParser parser,
            final DeserializationContext ctxt
    ) throws IOException
    {
        return Context.from(parser.getValueAsInt());
    }

}
