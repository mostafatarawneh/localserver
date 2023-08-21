package com.example.myapplication;

import fi.iki.elonen.NanoHTTPD;


import java.io.IOException;

public class LocalWebServer extends NanoHTTPD {

    public LocalWebServer() {
        super(8080); // Use your desired port number
    }

    @Override
    public Response serve(IHTTPSession session) {
        String msg = "<html><body><h1>Hello from Local Server!</h1></body></html>";
        return newFixedLengthResponse(Response.Status.OK, "text/html", msg);
    }
}


