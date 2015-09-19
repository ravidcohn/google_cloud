package com.example.Ravid.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Logger;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "aApi",
        version = "v1",
        resource = "a",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.Ravid.example.com",
                ownerName = "backend.myapplication.Ravid.example.com",
                packagePath = ""
        )
)
public class AEndpoint {

    private static final Logger logger = Logger.getLogger(AEndpoint.class.getName());

    /**
     * This method gets the <code>myA</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>myA</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getA")
    public myA getA(@Named("id") Long id) {
        // TODO: Implement this function
        logger.info("Calling getA method");
        return null;
    }

    /**
     * This inserts a new <code>myA</code> object.
     *
     * @param a The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertA")
    public myA insertA(myA a) {
        // TODO: Implement this function
        logger.info("Calling insertA method");
        return a;
    }
}