package com.adsizzler.mangolaa.domain.openrtb.enums

import com.adsizzler.BaseSpec

/**
 * Created by Ankush on 02/08/17.
 */
class MimeTypeSpec extends BaseSpec{

    def "resolve string to MimeType repr"() {

        when :
            def result = MimeType.from(str)

        then :
            result == expectedResult

        where :
            str   || expectedResult
            "application/json"     || MimeType.APPLICATION_JSON
            "application/javascript"      || MimeType.APPLICATION_JAVASCRIPT
            null  || MimeType.UNKNOWN
            " "   || MimeType.UNKNOWN

    }


}
