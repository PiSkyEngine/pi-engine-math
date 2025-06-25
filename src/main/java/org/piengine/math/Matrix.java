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

import java.lang.reflect.Array;
import java.util.Objects;

import org.piengine.math.coordinates.XYZIndexValues;
import org.piengine.math.coordinates.XYZValues;
import org.piengine.math.coordinates.XYZWIndexValues;

/**
 * The Interface Matrix.
 */
public interface Matrix extends Precision {

	/**
	 * The Interface Matrix1x2.
	 */
	interface Matrix1x2 extends Matrix {

		/**
		 * The Interface Matrix1x2d.
		 */
		interface Matrix1x2d extends Matrix1x2, PrecisionTd {
			
			/**
			 * @see org.piengine.math.Matrix#array()
			 */
			default @Override double[] array() {
				return new double[] {
						x(),
						y()
				};
			}

			/**
			 * X.
			 *
			 * @return the double
			 */
			default double x() {
				return xd();
			}

			/**
			 * Y.
			 *
			 * @return the double
			 */
			default double y() {
				return yd();
			}
		}

		/**
		 * The Interface Matrix1x2f.
		 */
		interface Matrix1x2f extends Matrix1x2, PrecisionTf {
			
			/**
			 * @see org.piengine.math.Matrix#array()
			 */
			default @Override float[] array() {
				return new float[] {
						x(),
						y()
				};
			}

			/**
			 * X.
			 *
			 * @return the float
			 */
			default float x() {
				return xf();
			}

			/**
			 * Y.
			 *
			 * @return the float
			 */
			default float y() {
				return yf();
			}
		}

		/**
		 * The Interface Matrix1x2i.
		 */
		interface Matrix1x2i extends Matrix1x2, PrecisionTi {
			
			/**
			 * @see org.piengine.math.Matrix#array()
			 */
			default @Override int[] array() {
				return new int[] {
						x(),
						y()
				};
			}

			/**
			 * X.
			 *
			 * @return the int
			 */
			default int x() {
				return xi();
			}

			/**
			 * Y.
			 *
			 * @return the int
			 */
			default int y() {
				return yi();
			}
		}

		/**
		 * The Interface Matrix1x2j.
		 */
		interface Matrix1x2j extends Matrix1x2, PrecisionTj {
			
			/**
			 * @see org.piengine.math.Matrix#array()
			 */
			default @Override long[] array() {
				return new long[] {
						x(),
						y()
				};
			}

			/**
			 * X.
			 *
			 * @return the long
			 */
			default long x() {
				return xj();
			}

			/**
			 * Y.
			 *
			 * @return the long
			 */
			default long y() {
				return yj();
			}
		}

		/** The rows. */
		int ROWS = 1;
		
		/** The cols. */
		int COLS = 2;
		
		/** The size. */
		int SIZE = 2;

		/**
		 * @see org.piengine.math.Matrix#cols()
		 */
		@Override
		default int cols() {
			return COLS;
		}

		/**
		 * @see org.piengine.math.Matrix#rows()
		 */
		@Override
		default int rows() {
			return ROWS;
		}

		/**
		 * @see org.piengine.math.Matrix#size()
		 */
		@Override
		default int size() {
			return SIZE;
		}

		/**
		 * Xd.
		 *
		 * @return the double
		 */
		default double xd() {
			return xn().doubleValue();
		}

		/**
		 * Xf.
		 *
		 * @return the float
		 */
		default float xf() {
			return xn().floatValue();
		}

		/**
		 * Xi.
		 *
		 * @return the int
		 */
		default int xi() {
			return xn().intValue();
		}

		/**
		 * Xj.
		 *
		 * @return the long
		 */
		default long xj() {
			return xn().longValue();
		}

		/**
		 * Xn.
		 *
		 * @return the number
		 */
		Number xn();

		/**
		 * Yd.
		 *
		 * @return the double
		 */
		default double yd() {
			return yn().doubleValue();
		}

		/**
		 * Yf.
		 *
		 * @return the float
		 */
		default float yf() {
			return yn().floatValue();
		}

		/**
		 * Yi.
		 *
		 * @return the int
		 */
		default int yi() {
			return yn().intValue();
		}

		/**
		 * Yj.
		 *
		 * @return the long
		 */
		default long yj() {
			return yn().longValue();
		}

		/**
		 * Yn.
		 *
		 * @return the number
		 */
		Number yn();
	}

	/**
	 * The Interface Matrix1x3.
	 */
	interface Matrix1x3 extends Matrix, XYZValues, XYZIndexValues {
		
		/**
		 * The Interface Matrix1x3d.
		 */
		interface Matrix1x3d extends Matrix1x3, PrecisionTd {
			
			/**
			 * @see org.piengine.math.Matrix#array()
			 */
			default @Override double[] array() {
				return new double[] {
						x(),
						y(),
						z()
				};
			}

			/**
			 * X.
			 *
			 * @return the double
			 */
			default double x() {
				return xd();
			}

			/**
			 * Y.
			 *
			 * @return the double
			 */
			default double y() {
				return yd();
			}

			/**
			 * Z.
			 *
			 * @return the double
			 */
			default double z() {
				return zd();
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#xd(int)
			 */
			@Override
			default double xd(int row) {
				Objects.checkIndex(row, ROWS);

				return array()[X_COL_OFFSET];
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#xf(int)
			 */
			@Override
			default float xf(int row) {
				return precisionCastToFloat(xd(row));
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#yd(int)
			 */
			@Override
			default double yd(int row) {
				Objects.checkIndex(row, ROWS);

				return array()[Y_COL_OFFSET];
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#yf(int)
			 */
			@Override
			default float yf(int row) {
				return precisionCastToFloat(yd(row));
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#zd(int)
			 */
			@Override
			default double zd(int row) {
				Objects.checkIndex(row, ROWS);

				return array()[Z_COL_OFFSET];
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#zf(int)
			 */
			@Override
			default float zf(int row) {
				return precisionCastToFloat(zd(row));
			}
		}

		/**
		 * The Interface Matrix1x3f.
		 */
		interface Matrix1x3f extends Matrix1x3, PrecisionTf {
			
			/**
			 * @see org.piengine.math.Matrix#array()
			 */
			default @Override float[] array() {
				return new float[] {
						x(),
						y(),
						z()
				};
			}

			/**
			 * X.
			 *
			 * @return the float
			 */
			default float x() {
				return xf();
			}

			/**
			 * Y.
			 *
			 * @return the float
			 */
			default float y() {
				return yf();
			}

			/**
			 * Z.
			 *
			 * @return the float
			 */
			default float z() {
				return zf();
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#xd(int)
			 */
			@Override
			default double xd(int row) {
				return xf(row);
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#xf(int)
			 */
			@Override
			default float xf(int row) {
				Objects.checkIndex(row, ROWS);
				return array()[X_COL_OFFSET];
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#yd(int)
			 */
			@Override
			default double yd(int row) {
				return yf(row);
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#yf(int)
			 */
			@Override
			default float yf(int row) {
				Objects.checkIndex(row, ROWS);
				return array()[Y_COL_OFFSET];
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#zd(int)
			 */
			@Override
			default double zd(int row) {
				return zf(row);
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#zf(int)
			 */
			@Override
			default float zf(int row) {
				Objects.checkIndex(row, ROWS);
				return array()[Z_COL_OFFSET];
			}
		}

		/** The rows. */
		int ROWS = 1;
		
		/** The cols. */
		int COLS = 3;
		
		/** The size. */
		int SIZE = 3;

		/**
		 * @see org.piengine.math.Matrix#cols()
		 */
		@Override
		default int cols() {
			return COLS;
		}

		/**
		 * @see org.piengine.math.Matrix#rows()
		 */
		@Override
		default int rows() {
			return ROWS;
		}

		/**
		 * @see org.piengine.math.Matrix#size()
		 */
		@Override
		default int size() {
			return SIZE;
		}

	}

	/**
	 * The Interface Matrix3.
	 */
	interface Matrix3 extends Matrix, XYZIndexValues {
		
		/**
		 * The Record Matrix3f.
		 *
		 * @param array the array
		 */
		record Matrix3f(float[] array) implements Matrix3, PrecisionTf {

			/**
			 * Instantiates a new matrix 3 f.
			 */
			public Matrix3f() {
				this(new float[SIZE]);
			}

			/**
			 * X.
			 *
			 * @param row the row
			 * @return the float
			 */
			public float x(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + X_COL_OFFSET];
			}

			/**
			 * Y.
			 *
			 * @param row the row
			 * @return the float
			 */
			public float y(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + Y_COL_OFFSET];
			}

			/**
			 * Z.
			 *
			 * @param row the row
			 * @return the float
			 */
			public float z(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + Z_COL_OFFSET];
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#xf(int)
			 */
			@Override
			public float xf(int row) {
				return x(row);
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#yf(int)
			 */
			@Override
			public float yf(int row) {
				return y(row);
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#zf(int)
			 */
			@Override
			public float zf(int row) {
				return z(row);
			}

		}

		/**
		 * The Record Matrix3d.
		 *
		 * @param array the array
		 */
		record Matrix3d(double[] array) implements Matrix3, PrecisionTd {

			/**
			 * Instantiates a new matrix 3 d.
			 */
			public Matrix3d() {
				this(new double[SIZE]);
			}

			/**
			 * X.
			 *
			 * @param row the row
			 * @return the double
			 */
			public double x(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + X_COL_OFFSET];
			}

			/**
			 * Y.
			 *
			 * @param row the row
			 * @return the double
			 */
			public double y(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + Y_COL_OFFSET];
			}

			/**
			 * Z.
			 *
			 * @param row the row
			 * @return the double
			 */
			public double z(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + Z_COL_OFFSET];
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#xf(int)
			 */
			@Override
			public float xf(int row) {
				return precisionCastToFloat(x(row));
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#yf(int)
			 */
			@Override
			public float yf(int row) {
				return precisionCastToFloat(y(row));
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#zf(int)
			 */
			@Override
			public float zf(int row) {
				return precisionCastToFloat(z(row));
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#xd(int)
			 */
			@Override
			public double xd(int row) {
				return x(row);
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#yd(int)
			 */
			@Override
			public double yd(int row) {
				return y(row);
			}

			/**
			 * @see org.piengine.math.coordinates.XYZIndexValues#zd(int)
			 */
			@Override
			public double zd(int row) {
				return z(row);
			}

		}

		/** The rows. */
		int ROWS = 3;
		
		/** The cols. */
		int COLS = 3;
		
		/** The size. */
		int SIZE = 9;

		/**
		 * @see org.piengine.math.Matrix#cols()
		 */
		@Override
		default int cols() {
			return COLS;
		}

		/**
		 * @see org.piengine.math.Matrix#rows()
		 */
		@Override
		default int rows() {
			return ROWS;
		}

		/**
		 * @see org.piengine.math.Matrix#size()
		 */
		@Override
		default int size() {
			return SIZE;
		}

	}

	/**
	 * The Interface Matrix4.
	 */
	interface Matrix4 extends Matrix, XYZWIndexValues {
		
		/**
		 * The Record Matrix4f.
		 *
		 * @param array the array
		 */
		record Matrix4f(float[] array) implements Matrix4, PrecisionTf {

			/**
			 * Instantiates a new matrix 4 f.
			 */
			public Matrix4f() {
				this(new float[SIZE]);
			}

			/**
			 * Multiply.
			 *
			 * @param other the other
			 * @return the matrix 4 f
			 */
			public Matrix4f multiply(Matrix4 other) {
				return MatrixOperations.multiplyf(this, other);
			}

			/**
			 * Translate.
			 *
			 * @param x the x
			 * @param y the y
			 * @param z the z
			 * @return the matrix 4 f
			 */
			public Matrix4f translate(double x, double y, double z) {
				return MatrixOperations.multiplyf(this, MatrixOperations.translation(x, y, z));
			}

			/**
			 * Rotate X.
			 *
			 * @param angle the angle
			 * @return the matrix 4 f
			 */
			public Matrix4f rotateX(double angle) {
				return MatrixOperations.multiplyf(this, MatrixOperations.rotationX(angle));
			}

			/**
			 * Rotate Y.
			 *
			 * @param angle the angle
			 * @return the matrix 4 f
			 */
			public Matrix4f rotateY(double angle) {
				return MatrixOperations.multiplyf(this, MatrixOperations.rotationY(angle));
			}

			/**
			 * Rotate Z.
			 *
			 * @param angle the angle
			 * @return the matrix 4 f
			 */
			public Matrix4f rotateZ(double angle) {
				return MatrixOperations.multiplyf(this, MatrixOperations.rotationZ(angle));
			}

			/**
			 * Scale.
			 *
			 * @param x the x
			 * @param y the y
			 * @param z the z
			 * @return the matrix 4 f
			 */
			public Matrix4f scale(double x, double y, double z) {
				return MatrixOperations.multiplyf(this, MatrixOperations.scaling(x, y, z));
			}

			/**
			 * Invert.
			 *
			 * @return the matrix 4 f
			 */
			public Matrix4f invert() {
				return MatrixOperations.invertf(this);
			}

			/**
			 * X.
			 *
			 * @param row the row
			 * @return the float
			 */
			public float x(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + X_COL_OFFSET];
			}

			/**
			 * Y.
			 *
			 * @param row the row
			 * @return the float
			 */
			public float y(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + Y_COL_OFFSET];
			}

			/**
			 * Z.
			 *
			 * @param row the row
			 * @return the float
			 */
			public float z(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + Z_COL_OFFSET];
			}

			/**
			 * W.
			 *
			 * @param row the row
			 * @return the float
			 */
			public float w(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + W_COL_OFFSET];
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#xf(int)
			 */
			@Override
			public float xf(int row) {
				return precisionCastToFloat(x(row));
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#yf(int)
			 */
			@Override
			public float yf(int row) {
				return precisionCastToFloat(y(row));
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#zf(int)
			 */
			@Override
			public float zf(int row) {
				return precisionCastToFloat(z(row));
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#wf(int)
			 */
			@Override
			public float wf(int row) {
				return precisionCastToFloat(w(row));
			}
		}

		/**
		 * The Record Matrix4d.
		 *
		 * @param array the array
		 */
		record Matrix4d(double[] array) implements Matrix4, PrecisionTd {

			/**
			 * Instantiates a new matrix 4 d.
			 */
			public Matrix4d() {
				this(new double[SIZE]);
			}

			/**
			 * Multiply.
			 *
			 * @param other the other
			 * @return the matrix 4 d
			 */
			public Matrix4d multiply(Matrix4 other) {
				return MatrixOperations.multiplyd(this, other);
			}

			/**
			 * Translate.
			 *
			 * @param x the x
			 * @param y the y
			 * @param z the z
			 * @return the matrix 4 d
			 */
			public Matrix4d translate(double x, double y, double z) {
				return MatrixOperations.multiplyd(this, MatrixOperations.translation(x, y, z));
			}

			/**
			 * Rotate X.
			 *
			 * @param angle the angle
			 * @return the matrix 4 d
			 */
			public Matrix4d rotateX(double angle) {
				return MatrixOperations.multiplyd(this, MatrixOperations.rotationX(angle));
			}

			/**
			 * Rotate Y.
			 *
			 * @param angle the angle
			 * @return the matrix 4 d
			 */
			public Matrix4d rotateY(double angle) {
				return MatrixOperations.multiplyd(this, MatrixOperations.rotationY(angle));
			}

			/**
			 * Rotate Z.
			 *
			 * @param angle the angle
			 * @return the matrix 4 d
			 */
			public Matrix4d rotateZ(double angle) {
				return MatrixOperations.multiplyd(this, MatrixOperations.rotationZ(angle));
			}

			/**
			 * Scale.
			 *
			 * @param x the x
			 * @param y the y
			 * @param z the z
			 * @return the matrix 4 d
			 */
			public Matrix4d scale(double x, double y, double z) {
				return MatrixOperations.multiplyd(this, MatrixOperations.scaling(x, y, z));
			}

			/**
			 * Invert.
			 *
			 * @return the matrix 4 d
			 */
			public Matrix4d invert() {
				return MatrixOperations.invertd(this);
			}

			/**
			 * X.
			 *
			 * @param row the row
			 * @return the double
			 */
			public double x(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + X_COL_OFFSET];
			}

			/**
			 * Y.
			 *
			 * @param row the row
			 * @return the double
			 */
			public double y(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + Y_COL_OFFSET];
			}

			/**
			 * Z.
			 *
			 * @param row the row
			 * @return the double
			 */
			public double z(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + Z_COL_OFFSET];
			}

			/**
			 * W.
			 *
			 * @param row the row
			 * @return the double
			 */
			public double w(int row) {
				Objects.checkIndex(row, ROWS);
				return array[row * COLS + W_COL_OFFSET];
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#xf(int)
			 */
			@Override
			public float xf(int row) {
				return precisionCastToFloat(x(row));
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#yf(int)
			 */
			@Override
			public float yf(int row) {
				return precisionCastToFloat(y(row));
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#zf(int)
			 */
			@Override
			public float zf(int row) {
				return precisionCastToFloat(z(row));
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#xd(int)
			 */
			@Override
			public double xd(int row) {
				return x(row);
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#yd(int)
			 */
			@Override
			public double yd(int row) {
				return y(row);
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#zd(int)
			 */
			@Override
			public double zd(int row) {
				return z(row);
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#wd(int)
			 */
			@Override
			public double wd(int row) {
				return w(row);
			}

			/**
			 * @see org.piengine.math.coordinates.XYZWIndexValues#wf(int)
			 */
			@Override
			public float wf(int row) {
				return precisionCastToFloat(w(row));
			}

		}

		/** The rows. */
		int ROWS = 4;
		
		/** The cols. */
		int COLS = 4;
		
		/** The size. */
		int SIZE = 16;

		/**
		 * @see org.piengine.math.Matrix#cols()
		 */
		@Override
		default int cols() {
			return COLS;
		}

		/**
		 * @see org.piengine.math.Matrix#rows()
		 */
		@Override
		default int rows() {
			return ROWS;
		}

		/**
		 * @see org.piengine.math.Matrix#size()
		 */
		@Override
		default int size() {
			return SIZE;
		}

	}

	/**
	 * Array.
	 *
	 * @return the object
	 */
	Object array();

	/**
	 * At.
	 *
	 * @param index the index
	 * @return the number
	 */
	default Number at(int index) {
		return switch (array()) {
		case int[] ai -> ai[index];
		case long[] aj -> aj[index];
		case float[] af -> af[index];
		case double[] ad -> ad[index];
		default -> throw new IllegalStateException("unexpected matrix backing array type");
		};
	}

	/**
	 * Cols.
	 *
	 * @return the int
	 */
	default int cols() {
		return switch (Array.getLength(array())) {
		case 2 -> 2; // 1x2
		case 3, 9 -> 3; // 1x3 or 3x3
		case 4, 16 -> 4; // 1x4 or 4x4
		default -> throw new IllegalStateException("unknown matrix shape");
		};
	}

	/**
	 * Rows.
	 *
	 * @return the int
	 */
	default int rows() {
		return switch (Array.getLength(array())) {
		case 2, 3, 4 -> 1; // 1x2 or 1x3 or 1x4
		case 9 -> 3; // 3x3
		case 16 -> 4; // 4x4
		default -> throw new IllegalStateException("unknown matrix shape");
		};
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	default int size() {
		return Array.getLength(array());
	}
}