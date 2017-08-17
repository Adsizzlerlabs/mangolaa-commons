package com.adsizzler.mangolaa.commons.domain.openrtb.response;

import com.adsizzler.mangolaa.commons.domain.openrtb.enums.NoBidCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Currency;
import java.util.Map;
import java.util.Set;

import static com.adsizzler.mangolaa.commons.constants.CurrencyConstants.DEFAULT;

/**
 * Created by Ankush on 03/08/17.
 */
@Data
@Builder
public class BidResponse {

    @JsonProperty("bidid")
    private final String bidResponseId;

    @JsonProperty("id")
    private final String bidRequestId;

    @JsonProperty("seatbid")
    private final Set<SeatBid> seatBids;

    @JsonProperty(value = "cur", defaultValue = DEFAULT)
    private final Currency currency;

    @JsonProperty("customdata")
    private final String customData;

    @JsonProperty("nbr")
    private final NoBidCode noBidCode;

    @JsonProperty("ext")
    private final Map<String,Object> extensions;

}
