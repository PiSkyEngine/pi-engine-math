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
package org.piengine.math.coordinates;

import org.piengine.math.Precision;

/**
 * The Interface XYZIndexValues.
 */
public interface XYZIndexValues extends Precision {
	
	/** The x col offset. */
	int X_COL_OFFSET = 0;
	
	/** The y col offset. */
	int Y_COL_OFFSET = 1;
	
	/** The z col offset. */
	int Z_COL_OFFSET = 2;
	
	/**
	 * Cols.
	 *
	 * @return the int
	 */
	int cols();

	/**
	 * Rows.
	 *
	 * @return the int
	 */
	int rows();

	/**
	 * Xd.
	 *
	 * @param row the row
	 * @return the double
	 */
	default double xd(int row) {
		return xf(row);
	}

	/**
	 * Xf.
	 *
	 * @param row the row
	 * @return the float
	 */
	float xf(int row);

	/**
	 * Xi.
	 *
	 * @param row the row
	 * @return the int
	 */
	default int xi(int row) {
		return precisionCastToInt(xf(row));
	}

	/**
	 * Xj.
	 *
	 * @param row the row
	 * @return the long
	 */
	default long xj(int row) {
		return precisionCastToLong(xf(row));
	}

	/**
	 * Xn.
	 *
	 * @param row the row
	 * @return the number
	 */
	default Number xn(int row) {
		return xf(row);
	}

	/**
	 * Yd.
	 *
	 * @param row the row
	 * @return the double
	 */
	default double yd(int row) {
		return yf(row);
	}

	/**
	 * Yf.
	 *
	 * @param row the row
	 * @return the float
	 */
	float yf(int row);

	/**
	 * Yi.
	 *
	 * @param row the row
	 * @return the int
	 */
	default int yi(int row) {
		return precisionCastToInt(yf(row));
	}

	/**
	 * Yj.
	 *
	 * @param row the row
	 * @return the long
	 */
	default long yj(int row) {
		return precisionCastToLong(yf(row));
	}

	/**
	 * Yn.
	 *
	 * @param row the row
	 * @return the number
	 */
	default Number yn(int row) {
		return yf(row);
	}

	/**
	 * Zd.
	 *
	 * @param row the row
	 * @return the double
	 */
	default double zd(int row) {
		return zf(row);
	}

	/**
	 * Zf.
	 *
	 * @param row the row
	 * @return the float
	 */
	float zf(int row);

	/**
	 * Zi.
	 *
	 * @param row the row
	 * @return the int
	 */
	default int zi(int row) {
		return precisionCastToInt(zf(row));
	}

	/**
	 * Zj.
	 *
	 * @param row the row
	 * @return the long
	 */
	default long zj(int row) {
		return precisionCastToLong(zf(row));
	}

	/**
	 * Zn.
	 *
	 * @param row the row
	 * @return the number
	 */
	default Number zn(int row) {
		return zf(row);
	}

}
