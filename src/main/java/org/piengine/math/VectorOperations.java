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
package org.piengine.math;

/**
 * The Class VectorOperations.
 */
public final class VectorOperations {

    /**
	 * Instantiates a new vector operations.
	 */
    private VectorOperations() {}

    /**
	 * Angle.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the double
	 */
    public static double angle(Vector3D a, Vector3D b) {
        double dot = a.dot(b);
        double mag = a.magnitude() * b.magnitude();
        if (mag == 0) {
            throw new ArithmeticException("Cannot compute angle with zero vector");
        }
        return Math.acos(dot / mag);
    }

    /**
	 * Project.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the vector 3 D
	 */
    public static Vector3D project(Vector3D a, Vector3D b) {
        double magB = b.magnitude();
        if (magB == 0) {
            throw new ArithmeticException("Cannot project onto zero vector");
        }
        double scale = a.dot(b) / (magB * magB);
        return b.scale(scale);
    }

    /**
	 * Reflect.
	 *
	 * @param a the a
	 * @param n the n
	 * @return the vector 3 D
	 */
    public static Vector3D reflect(Vector3D a, Vector3D n) {
        Vector3D nNorm = n.normalize();
        double dot = a.dot(nNorm);
        return a.subtract(nNorm.scale(2 * dot));
    }
}