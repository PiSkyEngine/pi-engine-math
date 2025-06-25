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
package org.piengine.math.shapes;

import org.piengine.math.Precision;
import org.piengine.math.coordinates.XYZValues;

/**
 * The Interface Point3D.
 */
public interface Point3D extends Shape, XYZValues, Precision {

	/**
	 * The Record Point3f.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 */
	record Point3f(float x, float y, float z) implements Point3D, PrecisionTf {

		/**
		 * @see org.piengine.math.shapes.Shape#dimension()
		 */
		@Override
		public int dimension() {
			return 3;
		}

		/**
		 * @see org.piengine.math.shapes.Shape#isValid()
		 */
		@Override
		public boolean isValid() {
			return !(Float.isNaN(x) || Float.isNaN(y) || Float.isNaN(z) ||
					Float.isInfinite(x) || Float.isInfinite(y) || Float.isInfinite(z));
		}

		/**
		 * @see org.piengine.math.shapes.Shape#getGeometry()
		 */
		@Override
		public String getGeometry() {
			throw new UnsupportedOperationException("not implemented yet");
		}

		/**
		 * @see org.piengine.math.shapes.Shape#getMaterial()
		 */
		@Override
		public String getMaterial() {
			throw new UnsupportedOperationException("not implemented yet");
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#xf()
		 */
		@Override
		public float xf() {
			return x;
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#yf()
		 */
		@Override
		public float yf() {
			return y;
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#zf()
		 */
		@Override
		public float zf() {
			return z;
		}

	}

	/**
	 * The Record Point3d.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 */
	record Point3d(double x, double y, double z) implements Point3D, PrecisionTd {

		/**
		 * @see org.piengine.math.shapes.Shape#dimension()
		 */
		@Override
		public int dimension() {
			return 3;
		}

		/**
		 * @see org.piengine.math.shapes.Shape#isValid()
		 */
		@Override
		public boolean isValid() {
			return !(Double.isNaN(x) || Double.isNaN(y) || Double.isNaN(z) ||
					Double.isInfinite(x) || Double.isInfinite(y) || Double.isInfinite(z));
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#xd()
		 */
		@Override
		public double xd() {
			return x;
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#yd()
		 */
		@Override
		public double yd() {
			return y;
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#zd()
		 */
		@Override
		public double zd() {
			return z;
		}

		/**
		 * @see org.piengine.math.shapes.Shape#getGeometry()
		 */
		@Override
		public String getGeometry() {
			throw new UnsupportedOperationException("not implemented yet");
		}

		/**
		 * @see org.piengine.math.shapes.Shape#getMaterial()
		 */
		@Override
		public String getMaterial() {
			throw new UnsupportedOperationException("not implemented yet");
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#xf()
		 */
		@Override
		public float xf() {
			return precisionCastToFloat(x);
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#yf()
		 */
		@Override
		public float yf() {
			return precisionCastToFloat(y);
		}

		/**
		 * @see org.piengine.math.coordinates.XYZValues#zf()
		 */
		@Override
		public float zf() {
			return precisionCastToFloat(z);
		}

	}

	/**
	 * Of double.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the point 3 d
	 */
	static Point3d ofDouble(double x, double y, double z) {
		return new Point3d(x, y, z);
	}

	/**
	 * Of float.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the point 3 f
	 */
	static Point3f ofFloat(float x, float y, float z) {
		return new Point3f(x, y, z);
	}

}