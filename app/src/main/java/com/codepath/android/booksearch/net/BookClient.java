package com.codepath.android.booksearch.net;

import com.codepath.android.booksearch.Constants;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class BookClient {
    private AsyncHttpClient client;

    public BookClient() {
        this.client = new AsyncHttpClient();
    }

    private String getApiUrl(String relativeUrl) {
        return Constants.API_BASE_URL + relativeUrl;
    }

    // Method for accessing books API to get publisher and no. of pages in a book.
    public void getExtraBookDetails(String openLibraryId, JsonHttpResponseHandler handler) {
        String url = getApiUrl("books/");
        client.get(url + openLibraryId + ".json", handler);
    }
}
