package com.adsizzler.mangolaa.domain;

import com.adsizzler.mangolaa.utils.Strings;
import com.adsizzler.mangolaa.json.jackson.deserializers.StatusDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.experimental.var;

/**
 * Created by Ankush on 17/07/17.
 */
@Getter
@JsonDeserialize(using = StatusDeserializer.class)
public enum Status {

    UNKNOWN(0),
    ACTIVE(1),
    DEACTIVE(2);

    private final int code;

    Status(final int code){
        this.code = code;
    }

    public static Status from(final int code){
        Status result;
        switch(code){
            case 1 : result = ACTIVE; break;
            case 2 : result = DEACTIVE; break;
            default : result = UNKNOWN; break;
        }
        return result;
    }

    public static Status from(final String string){
        var status  = UNKNOWN;
        if(Strings.hasText(string)){
            if(string.equalsIgnoreCase("deactive")){
                status =  DEACTIVE;
            }
            else if (string.equalsIgnoreCase("active")){
                status =  ACTIVE;
            }
        }
        return status;
    }
}
