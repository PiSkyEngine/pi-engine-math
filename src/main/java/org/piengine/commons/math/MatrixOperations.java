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
package org.piengine.commons.math;

import org.piengine.commons.math.Matrix.Matrix4;
import org.piengine.commons.math.Matrix.Matrix4.Matrix4d;
import org.piengine.commons.math.Matrix.Matrix4.Matrix4f;

/**
 * The Class MatrixOperations.
 */
public final class MatrixOperations {

    /**
	 * Instantiates a new matrix operations.
	 */
    private MatrixOperations() {}

    /**
	 * Multiplyf.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the matrix 4 f
	 */
    public static Matrix4f multiplyf(Matrix4 a, Matrix4 b) {
        float[] result = new float[16];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                float sum = 0;
                for (int k = 0; k < 4; k++) {
                    sum += a.at(i * 4 + k).floatValue() * b.at(k * 4 + j).floatValue();
                }
                result[i * 4 + j] = sum;
            }
        }
        return new Matrix4f(result);
    }

    /**
	 * Multiplyd.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the matrix 4 d
	 */
    public static Matrix4d multiplyd(Matrix4 a, Matrix4 b) {
        double[] result = new double[16];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                double sum = 0;
                for (int k = 0; k < 4; k++) {
                    sum += a.at(i * 4 + k).doubleValue() * b.at(k * 4 + j).doubleValue();
                }
                result[i * 4 + j] = sum;
            }
        }
        return new Matrix4d(result);
    }

    /**
	 * Multiply.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the matrix 4
	 */
    public static Matrix4 multiply(Matrix4 a, Matrix4 b) {
        return multiplyd(a, b);
    }

    /**
	 * Translationf.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the matrix 4 f
	 */
    public static Matrix4f translationf(float x, float y, float z) {
        float[] result = {
            1, 0, 0, x,
            0, 1, 0, y,
            0, 0, 1, z,
            0, 0, 0, 1
        };
        return new Matrix4f(result);
    }

    /**
	 * Translationd.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the matrix 4 d
	 */
    public static Matrix4d translationd(double x, double y, double z) {
        double[] result = {
            1, 0, 0, x,
            0, 1, 0, y,
            0, 0, 1, z,
            0, 0, 0, 1
        };
        return new Matrix4d(result);
    }

    /**
	 * Translation.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the matrix 4
	 */
    public static Matrix4 translation(double x, double y, double z) {
        return translationd(x, y, z);
    }

    /**
	 * Rotation xf.
	 *
	 * @param angle the angle
	 * @return the matrix 4 f
	 */
    public static Matrix4f rotationXf(float angle) {
        float c = (float) Math.cos(angle);
        float s = (float) Math.sin(angle);
        float[] result = {
            1, 0, 0, 0,
            0, c, -s, 0,
            0, s, c, 0,
            0, 0, 0, 1
        };
        return new Matrix4f(result);
    }

    /**
	 * Rotation xd.
	 *
	 * @param angle the angle
	 * @return the matrix 4 d
	 */
    public static Matrix4d rotationXd(double angle) {
        double c = Math.cos(angle);
        double s = Math.sin(angle);
        double[] result = {
            1, 0, 0, 0,
            0, c, -s, 0,
            0, s, c, 0,
            0, 0, 0, 1
        };
        return new Matrix4d(result);
    }

    /**
	 * Rotation X.
	 *
	 * @param angle the angle
	 * @return the matrix 4
	 */
    public static Matrix4 rotationX(double angle) {
        return rotationXd(angle);
    }

    /**
	 * Rotation yf.
	 *
	 * @param angle the angle
	 * @return the matrix 4 f
	 */
    public static Matrix4f rotationYf(float angle) {
        float c = (float) Math.cos(angle);
        float s = (float) Math.sin(angle);
        float[] result = {
            c, 0, s, 0,
            0, 1, 0, 0,
            -s, 0, c, 0,
            0, 0, 0, 1
        };
        return new Matrix4f(result);
    }

    /**
	 * Rotation yd.
	 *
	 * @param angle the angle
	 * @return the matrix 4 d
	 */
    public static Matrix4d rotationYd(double angle) {
        double c = Math.cos(angle);
        double s = Math.sin(angle);
        double[] result = {
            c, 0, s, 0,
            0, 1, 0, 0,
            -s, 0, c, 0,
            0, 0, 0, 1
        };
        return new Matrix4d(result);
    }

    /**
	 * Rotation Y.
	 *
	 * @param angle the angle
	 * @return the matrix 4
	 */
    public static Matrix4 rotationY(double angle) {
        return rotationYd(angle);
    }

    /**
	 * Rotation zj.
	 *
	 * @param angle the angle
	 * @return the matrix 4 d
	 */
    public static Matrix4d rotationZj(double angle) {
    	double c = Math.cos(angle);
        double s = Math.sin(angle);
        double[] result = {
            c, -s, 0, 0,
            s, c, 0, 0,
            0, 0, 1, 0,
            0, 0, 0, 1
        };
        return new Matrix4d(result);
    }

    /**
	 * Rotation zf.
	 *
	 * @param angle the angle
	 * @return the matrix 4 f
	 */
    public static Matrix4f rotationZf(float angle) {
        float c = (float) Math.cos(angle);
        float s = (float) Math.sin(angle);
        float[] result = {
            c, -s, 0, 0,
            s, c, 0, 0,
            0, 0, 1, 0,
            0, 0, 0, 1
        };
        return new Matrix4f(result);
    }

    /**
	 * Rotation zd.
	 *
	 * @param angle the angle
	 * @return the matrix 4 d
	 */
    public static Matrix4d rotationZd(double angle) {
        double c = Math.cos(angle);
        double s = Math.sin(angle);
        double[] result = {
            c, -s, 0, 0,
            s, c, 0, 0,
            0, 0, 1, 0,
            0, 0, 0, 1
        };
        return new Matrix4d(result);
    }

    /**
	 * Rotation Z.
	 *
	 * @param angle the angle
	 * @return the matrix 4
	 */
    public static Matrix4 rotationZ(double angle) {
        return rotationZd(angle);
    }

    /**
	 * Scalingf.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the matrix 4 f
	 */
    public static Matrix4f scalingf(float x, float y, float z) {
        float[] result = {
            x, 0, 0, 0,
            0, y, 0, 0,
            0, 0, z, 0,
            0, 0, 0, 1
        };
        return new Matrix4f(result);
    }

    /**
	 * Scalingd.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the matrix 4 d
	 */
    public static Matrix4d scalingd(double x, double y, double z) {
        double[] result = {
            x, 0, 0, 0,
            0, y, 0, 0,
            0, 0, z, 0,
            0, 0, 0, 1
        };
        return new Matrix4d(result);
    }

    /**
	 * Scaling.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the matrix 4
	 */
    public static Matrix4 scaling(double x, double y, double z) {
        return scalingd(x, y, z);
    }

    /**
	 * Invertf.
	 *
	 * @param m the m
	 * @return the matrix 4 f
	 */
    public static Matrix4f invertf(Matrix4 m) {
        float[] mat = new float[16];
        float[] inv = new float[16];
        for (int i = 0; i < 16; i++) {
            mat[i] = m.at(i).floatValue();
            inv[i] = (i % 5 == 0) ? 1 : 0; // Identity matrix
        }

        for (int i = 0; i < 4; i++) {
            float pivot = mat[i * 4 + i];
            if (Math.abs(pivot) < 1e-10) {
                return null; // Not invertible
            }
            for (int j = 0; j < 4; j++) {
                mat[i * 4 + j] /= pivot;
                inv[i * 4 + j] /= pivot;
            }
            for (int k = 0; k < 4; k++) {
                if (k != i) {
                    float factor = mat[k * 4 + i];
                    for (int j = 0; j < 4; j++) {
                        mat[k * 4 + j] -= factor * mat[i * 4 + j];
                        inv[k * 4 + j] -= factor * inv[i * 4 + j];
                    }
                }
            }
        }
        return new Matrix4f(inv);
    }

    /**
	 * Invertd.
	 *
	 * @param m the m
	 * @return the matrix 4 d
	 */
    public static Matrix4d invertd(Matrix4 m) {
        double[] mat = new double[16];
        double[] inv = new double[16];
        for (int i = 0; i < 16; i++) {
            mat[i] = m.at(i).doubleValue();
            inv[i] = (i % 5 == 0) ? 1 : 0; // Identity matrix
        }

        for (int i = 0; i < 4; i++) {
            double pivot = mat[i * 4 + i];
            if (Math.abs(pivot) < 1e-10) {
                return null; // Not invertible
            }
            for (int j = 0; j < 4; j++) {
                mat[i * 4 + j] /= pivot;
                inv[i * 4 + j] /= pivot;
            }
            for (int k = 0; k < 4; k++) {
                if (k != i) {
                    double factor = mat[k * 4 + i];
                    for (int j = 0; j < 4; j++) {
                        mat[k * 4 + j] -= factor * mat[i * 4 + j];
                        inv[k * 4 + j] -= factor * inv[i * 4 + j];
                    }
                }
            }
        }
        return new Matrix4d(inv);
    }

    /**
	 * Invert.
	 *
	 * @param m the m
	 * @return the matrix 4
	 */
    public static Matrix4 invert(Matrix4 m) {
        return invertd(m);
    }
}