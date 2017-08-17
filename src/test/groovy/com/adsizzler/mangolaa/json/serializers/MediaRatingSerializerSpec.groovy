package com.adsizzler.mangolaa.json.serializers

import com.adsizzler.BaseSpec
import com.adsizzler.mangolaa.domain.openrtb.enums.MediaRating
import com.adsizzler.mangolaa.json.jackson.serializers.MediaRatingSerializer
import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.databind.ObjectMapper

/**
 * Created by Ankush on 08/08/17.
 */
class MediaRatingSerializerSpec extends BaseSpec{

    Writer writer
    def jsonGen
    def objMapper
    def serializerProvider

    def setup(){
        objMapper = new ObjectMapper()
        writer = new StringWriter()
        serializerProvider = objMapper.getSerializerProvider()
    }

    def "Test out various MediaRating values. MediaRatingSerializer would convert MediaRating values to their string repr "(){
        given :
            jsonGen = new JsonFactory().createGenerator(writer)
            def serializer = new MediaRatingSerializer()

        when :
            serializer.serialize(MediaRating.EVERYONE_OVER_12, jsonGen, serializerProvider)
            jsonGen.flush()

        then :
            writer.toString().replace('"','') as Integer == MediaRating.EVERYONE_OVER_12.code

    }

}
