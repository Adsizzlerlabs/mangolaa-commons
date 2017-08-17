package com.adsizzler.mangolaa.json.serializers

import com.adsizzler.BaseSpec
import com.adsizzler.mangolaa.domain.openrtb.enums.Category
import com.adsizzler.mangolaa.json.jackson.serializers.CategorySerializer
import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.databind.ObjectMapper

/**
 * Created by Ankush on 04/08/17.
 */
class CategorySerializerSpec extends BaseSpec{

    Writer writer
    def jsonGen
    def objMapper
    def serializerProvider

    def setup(){
        objMapper = new ObjectMapper()
        writer = new StringWriter()
        serializerProvider = objMapper.getSerializerProvider()
    }

    def "Test out various Category values. CategorySerializer woould convert Category values to their string repr "(){
        given :
            jsonGen = new JsonFactory().createGenerator(writer)
            def serializer = new CategorySerializer()

        when :
            serializer.serialize(Category.IAB11_2, jsonGen, serializerProvider)
            jsonGen.flush()

        then :
             writer.toString().replace('"','') == Category.IAB11_2.code

    }

}
