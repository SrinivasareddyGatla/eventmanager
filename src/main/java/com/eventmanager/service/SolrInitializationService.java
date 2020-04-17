package com.eventmanager.service;

import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.request.CoreAdminRequest;
import org.springframework.stereotype.Service;

@Service
public class SolrInitializationService {

    public static void init() {
        final HttpSolrClient client = getCleint();
    }

    public static HttpSolrClient getCleint() {
        final String solrUrl = "http://localhost:8983/solr";
        return new HttpSolrClient.Builder(solrUrl)
                .withConnectionTimeout(10000)
                .withSocketTimeout(60000)
                .build();
    }
}
