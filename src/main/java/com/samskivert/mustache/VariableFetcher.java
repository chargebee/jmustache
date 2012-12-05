/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samskivert.mustache;

/** Used to read variables from values. */
public interface VariableFetcher {

    /** Reads the so-named variable from the supplied context object. */
    Object get(Object ctx, String name) throws Exception;
    
}
