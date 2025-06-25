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

import org.piengine.math.Matrix.Matrix1x3;
import org.piengine.math.coordinates.Coordinate;
import org.piengine.math.shapes.Point3D;

/**
 * The Interface Vector3D.
 */
public interface Vector3D extends Coordinate, Matrix1x3 {

	/**
	 * The Record Vector3f.
	 *
	 * @param array the array
	 */
	record Vector3f(float[] array) implements Vector3D, Matrix1x3f {

		/**
		 * Instantiates a new vector 3 f.
		 *
		 * @param array the array
		 */
		public Vector3f {
			assert array != null;
			assert array.length == 3;
		}

		/**
		 * Instantiates a new vector 3 f.
		 *
		 * @param x the x
		 * @param y the y
		 * @param z the z
		 */
		public Vector3f(float x, float y, float z) {
			this(new float[] {
					x,
					y,
					z
			});
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#xf()
		 */
		@Override
		public float xf() {
			return array[0];
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#yf()
		 */
		@Override
		public float yf() {
			return array[1];
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#zf()
		 */
		@Override
		public float zf() {
			return array[2];
		}

		/**
		 * @see org.piengine.math.Vector3D#normalize()
		 */
		@Override
		public Vector3D normalize() {
			float mag = (float) magnitude();
			if (mag == 0) {
				throw new ArithmeticException("Cannot normalize a zero vector");
			}
			return new Vector3f(xf() / mag, yf() / mag, zf() / mag);
		}

		/**
		 * @see org.piengine.math.Vector3D#add(org.piengine.math.Vector3D)
		 */
		@Override
		public Vector3D add(Vector3D vector) {
			return new Vector3f(xf() + vector.xf(), yf() + vector.yf(), zf() + vector.zf());
		}

		/**
		 * @see org.piengine.math.Vector3D#subtract(org.piengine.math.Vector3D)
		 */
		@Override
		public Vector3D subtract(Vector3D vector) {
			return new Vector3f(xf() - vector.xf(), yf() - vector.yf(), zf() - vector.zf());
		}

		/**
		 * @see org.piengine.math.Vector3D#scale(double)
		 */
		@Override
		public Vector3D scale(double factor) {
			return new Vector3f((float) (xf() * factor), (float) (yf() * factor), (float) (zf() * factor));
		}

		/**
		 * @see org.piengine.math.Vector3D#toPoint()
		 */
		@Override
		public Point3D toPoint() {
			return Point3D.ofFloat(xf(), yf(), zf());
		}

	}

	/**
	 * The Record Vector3d.
	 *
	 * @param array the array
	 */
	record Vector3d(double[] array) implements Vector3D, Matrix1x3d {

		/**
		 * Instantiates a new vector 3 d.
		 *
		 * @param array the array
		 */
		public Vector3d {
			assert array != null;
			assert array.length == 3;
		}

		/**
		 * Instantiates a new vector 3 d.
		 *
		 * @param x the x
		 * @param y the y
		 * @param z the z
		 */
		public Vector3d(double x, double y, double z) {
			this(new double[] {
					x,
					y,
					z
			});
		}

		/**
		 * @see org.piengine.math.Vector3D#normalize()
		 */
		@Override
		public Vector3D normalize() {
			double mag = magnitude();
			if (mag == 0) {
				throw new ArithmeticException("Cannot normalize a zero vector");
			}
			return new Vector3d(xd() / mag, yd() / mag, zd() / mag);
		}

		/**
		 * @see org.piengine.math.Vector3D#add(org.piengine.math.Vector3D)
		 */
		@Override
		public Vector3D add(Vector3D vector) {
			return new Vector3d(xd() + vector.xd(), yd() + vector.yd(), zd() + vector.zd());
		}

		/**
		 * @see org.piengine.math.Vector3D#subtract(org.piengine.math.Vector3D)
		 */
		@Override
		public Vector3D subtract(Vector3D vector) {
			return new Vector3d(xd() - vector.xd(), yd() - vector.yd(), zd() - vector.zd());
		}

		/**
		 * @see org.piengine.math.Vector3D#scale(double)
		 */
		@Override
		public Vector3D scale(double factor) {
			return new Vector3d(xd() * factor, yd() * factor, zd() * factor);
		}

		/**
		 * @see org.piengine.math.Vector3D#toPoint()
		 */
		@Override
		public Point3D toPoint() {
			return Point3D.ofDouble(xd(), yd(), zd());
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#xf()
		 */
		@Override
		public float xf() {
			return precisionCastToFloat(xd());
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#yf()
		 */
		@Override
		public float yf() {
			return precisionCastToFloat(yd());
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#zf()
		 */
		@Override
		public float zf() {
			return precisionCastToFloat(zd());
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#xd()
		 */
		@Override
		public double xd() {
			return array[X_COL_OFFSET];
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#yd()
		 */
		@Override
		public double yd() {
			return array[Y_COL_OFFSET];
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#zd()
		 */
		@Override
		public double zd() {
			return array[Z_COL_OFFSET];
		}

	}

	/**
	 * From point.
	 *
	 * @param point the point
	 * @return the vector 3 D
	 */
	static Vector3D fromPoint(Point3D point) {
		if (point instanceof Point3D.Point3f p) {
			return new Vector3f(p.x(), p.y(), p.z());
		} else if (point instanceof Point3D.Point3d p) {
			return new Vector3d(p.x(), p.y(), p.z());
		} else {
			return new Vector3d(point.xd(), point.yd(), point.zd());
		}
	}

	/**
	 * Of double.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the vector 3 d
	 */
	static Vector3d ofDouble(double x, double y, double z) {
		return new Vector3d(x, y, z);
	}

	/**
	 * Of float.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the vector 3 f
	 */
	static Vector3f ofFloat(float x, float y, float z) {
		return new Vector3f(x, y, z);
	}

	/**
	 * Adds the.
	 *
	 * @param vector the vector
	 * @return the vector 3 D
	 */
	Vector3D add(Vector3D vector);

	/**
	 * Cross.
	 *
	 * @param vector the vector
	 * @return the vector 3 D
	 */
	default Vector3D cross(Vector3D vector) {
		double x = yd() * vector.zd() - zd() * vector.yd();
		double y = zd() * vector.xd() - xd() * vector.zd();
		double z = xd() * vector.yd() - yd() * vector.xd();
		return Vector3D.ofDouble(x, y, z);
	}

	/**
	 * @see org.piengine.math.coordinates.Coordinate#dimension()
	 */
	@Override
	default int dimension() {
		return 3;
	}

	/**
	 * Dot.
	 *
	 * @param vector the vector
	 * @return the double
	 */
	default double dot(Vector3D vector) {
		return xd() * vector.xd() + yd() * vector.yd() + zd() * vector.zd();
	}

	/**
	 * @see org.piengine.math.coordinates.Coordinate#isValid()
	 */
	@Override
	default boolean isValid() {
		return !(Double.isNaN(xd()) || Double.isNaN(yd()) || Double.isNaN(zd()) ||
				Double.isInfinite(xd()) || Double.isInfinite(yd()) || Double.isInfinite(zd()));
	}

	/**
	 * Magnitude.
	 *
	 * @return the double
	 */
	default double magnitude() {
		double x = xd();
		double y = yd();
		double z = zd();
		return Math.sqrt(x * x + y * y + z * z);
	}

	/**
	 * Normalize.
	 *
	 * @return the vector 3 D
	 */
	Vector3D normalize();

	/**
	 * Scale.
	 *
	 * @param factor the factor
	 * @return the vector 3 D
	 */
	Vector3D scale(double factor);

	/**
	 * Subtract.
	 *
	 * @param vector the vector
	 * @return the vector 3 D
	 */
	Vector3D subtract(Vector3D vector);

	/**
	 * To point.
	 *
	 * @return the point 3 D
	 */
	Point3D toPoint();
}