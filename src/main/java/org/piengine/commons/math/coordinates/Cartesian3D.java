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
package org.piengine.commons.math.coordinates;

import org.piengine.commons.math.Matrix.Matrix1x3;

/**
 * The Interface Cartesian3D.
 */
public interface Cartesian3D extends Coordinate, Matrix1x3 {

	/**
	 * The Interface Cartesian3d.
	 */
	interface Cartesian3d extends Cartesian3D, Matrix1x3d {}

	/**
	 * The Interface Cartesian3f.
	 */
	interface Cartesian3f extends Cartesian3D, Matrix1x3f {}

	/**
	 * Adds the.
	 *
	 * @param point the point
	 * @return the cartesian 3 D
	 */
	Cartesian3D add(Cartesian3D point);

	/**
	 * @see org.piengine.commons.math.coordinates.Coordinate#dimension()
	 */
	@Override
	default int dimension() {
		return 3;
	}

	/**
	 * Distance to.
	 *
	 * @param point the point
	 * @return the double
	 */
	default double distanceTo(Cartesian3D point) {
		double dx = xd() - point.xd();
		double dy = yd() - point.yd();
		double dz = zd() - point.zd();
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}

	/**
	 * Equals.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return true, if successful
	 */
	default boolean equals(int x, int y, int z) {
		return xi() == x && yi() == y && zi() == z;
	}

	/**
	 * Subtract.
	 *
	 * @param point the point
	 * @return the cartesian 3 D
	 */
	Cartesian3D subtract(Cartesian3D point);
}