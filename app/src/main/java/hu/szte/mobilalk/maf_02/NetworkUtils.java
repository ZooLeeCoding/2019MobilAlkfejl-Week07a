package hu.szte.mobilalk.maf_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;

public class NetworkUtils {

    private static final String LOG_TAG =
            NetworkUtils.class.getSimpleName();

    private static final String BOOK_BASE_URL =  "https://www.googleapis.com/books/v1/volumes?";

    private static final String QUERY_PARAM = "q";

    private static final String MAX_RESULTS = "maxResults";

    private static final String PRINT_TYPE = "printType";

    public static String getBookInfo(String queryString) {
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String bookJSONString = null;

        try {

        } catch(IOException e) {
            e.printStackTrace();
        } finally {

        }

        return null;
    }

}
