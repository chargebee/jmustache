/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samskivert.mustache;

/**
 *
 * @author cb-intern7
 */
public interface BlockSegmentValidator {

    void validate(String top, String bottom, int line);
}

