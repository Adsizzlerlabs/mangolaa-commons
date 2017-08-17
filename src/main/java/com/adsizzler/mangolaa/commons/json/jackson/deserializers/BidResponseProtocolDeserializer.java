package com.adsizzler.mangolaa.commons.json.jackson.deserializers;

import com.adsizzler.mangolaa.commons.domain.openrtb.enums.BidResponseProtocol;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * Created by Ankush on 04/08/17.
 */
public class BidResponseProtocolDeserializer extends JsonDeserializer<BidResponseProtocol> {

    @Override
    public BidResponseProtocol deserialize(
            final JsonParser parser,
            final DeserializationContext ctxt
    ) throws IOException
    {
        return BidResponseProtocol.from(parser.getValueAsInt());
    }

}
