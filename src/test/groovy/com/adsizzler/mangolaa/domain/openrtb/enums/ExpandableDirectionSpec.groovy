package com.adsizzler.mangolaa.domain.openrtb.enums

import com.adsizzler.BaseSpec

/**
 * Created by Ankush on 02/08/17.
 */
class ExpandableDirectionSpec extends BaseSpec{

    def "resolve int to ExpandableDirection repr"() {

        when :
            def result = ExpandableDirection.from(code)

        then :
            result == expectedResult

        where :
            code || expectedResult
            1    || ExpandableDirection.LEFT
            2    || ExpandableDirection.RIGHT
            3    || ExpandableDirection.UP
            4    || ExpandableDirection.DOWN
            5    || ExpandableDirection.FULL_SCREEN
            0    || ExpandableDirection.UNKNOWN
    }

}
