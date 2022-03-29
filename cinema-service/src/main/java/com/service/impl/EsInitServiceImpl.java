package com.service.impl;

import com.service.EsInitService;
import org.apache.http.HttpHost;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.PutMappingRequest;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EsInitServiceImpl  implements EsInitService {
    @Override
    public void init(String indexName) {
        createIndex(indexName);
        createMapping(indexName);
    }

    public void createIndex(String indexName){
        try (RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(
                new HttpHost("localhost", 9200, "http")))) {
            CreateIndexRequest request = new CreateIndexRequest(indexName);
            CreateIndexResponse response = client
                    .indices()
                    .create(request,
                            RequestOptions.DEFAULT);
            boolean acknowledged = response.isAcknowledged();
            System.out.println(acknowledged);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createMapping(String indexName){
        try (RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(
                new HttpHost("localhost", 9200, "http")))) {
            PutMappingRequest request = new PutMappingRequest(indexName);
            request.source("{\n" +
                    "  \"properties\": {\n" +
                    "    \"movieName\": {\n" +
                    "      \"type\": \"text\"\n" +
                    "      \"analyzer\": \"ik_max_word\"\n" +
                    "    },\n" +
                    "    \"director\": {\n" +
                    "      \"type\": \"text\"\n" +
                    "      \"analyzer\": \"ik_max_word\"\n" +
                    "    },\n" +
                    "    \"actorsName\": {\n" +
                    "      \"type\": \"text\",\n" +
                    "      \"analyzer\": \"ik_max_word\"\n" +
                    "    }\n" +
                    "  }\n" +
                    "}", XContentType.JSON);
            AcknowledgedResponse response = client.indices().putMapping(request,
                    RequestOptions.DEFAULT);
            boolean acknowledged = response.isAcknowledged();
            System.out.println(acknowledged);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
