/*
 * MIT License
 * 
 * Copyright (c) 2025 Sly Technologies Inc
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.piengine.commons.math.shapes;

/**
 * The Class Torus.
 */
public class Torus implements Shape {
    
    /** The minor radius. */
    private final double majorRadius, minorRadius;
    
    /** The geometry. */
    private final String geometry = "torus.pio";
    
    /** The material. */
    private final String material = "default.pim";

    /**
	 * Instantiates a new torus.
	 *
	 * @param majorRadius the minor radius.
	 * @param minorRadius the minor radius.
	 */
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    /**
     * @see org.piengine.commons.math.shapes.Shape#dimension()
     */
    @Override
    public int dimension() {
        return 3;
    }

    /**
     * @see org.piengine.commons.math.shapes.Shape#isValid()
     */
    @Override
    public boolean isValid() {
        return majorRadius > 0 && minorRadius > 0 && majorRadius > minorRadius;
    }

    /**
     * @see org.piengine.commons.math.shapes.Shape#getGeometry()
     */
    @Override
    public String getGeometry() {
        return geometry;
    }

    /**
     * @see org.piengine.commons.math.shapes.Shape#getMaterial()
     */
    @Override
    public String getMaterial() {
        return material;
    }
}