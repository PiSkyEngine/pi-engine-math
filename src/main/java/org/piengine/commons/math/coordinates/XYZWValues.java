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

import org.piengine.commons.math.Precision;

/**
 * The Interface XYZWValues.
 */
public interface XYZWValues extends Precision {
	
	/**
	 * Wf.
	 *
	 * @return the float
	 */
	float wf();

	/**
	 * Wi.
	 *
	 * @return the int
	 */
	default int wi() {
		return precisionCastToInt(wf());
	}

	/**
	 * Wj.
	 *
	 * @return the long
	 */
	default long wj() {
		return precisionCastToLong(wf());
	}

	/**
	 * Wn.
	 *
	 * @return the number
	 */
	default Number wn() {
		return wf();
	}

	/**
	 * Xd.
	 *
	 * @return the double
	 */
	default double xd() {
		return xf();
	}

	/**
	 * Xf.
	 *
	 * @return the float
	 */
	float xf();

	/**
	 * Xi.
	 *
	 * @return the int
	 */
	default int xi() {
		return precisionCastToInt(xf());
	}

	/**
	 * Xj.
	 *
	 * @return the long
	 */
	default long xj() {
		return precisionCastToLong(xf());
	}

	/**
	 * Xn.
	 *
	 * @return the number
	 */
	default Number xn() {
		return xf();
	}

	/**
	 * Yd.
	 *
	 * @return the double
	 */
	default double yd() {
		return yf();
	}

	/**
	 * Yf.
	 *
	 * @return the float
	 */
	float yf();

	/**
	 * Yi.
	 *
	 * @return the int
	 */
	default int yi() {
		return precisionCastToInt(yf());
	}

	/**
	 * Yj.
	 *
	 * @return the long
	 */
	default long yj() {
		return precisionCastToLong(yf());
	}

	/**
	 * Yn.
	 *
	 * @return the number
	 */
	default Number yn() {
		return yf();
	}

	/**
	 * Zd.
	 *
	 * @return the double
	 */
	default double zd() {
		return zf();
	}

	/**
	 * Zf.
	 *
	 * @return the float
	 */
	float zf();

	/**
	 * Zi.
	 *
	 * @return the int
	 */
	default int zi() {
		return precisionCastToInt(zf());
	}

	/**
	 * Zj.
	 *
	 * @return the long
	 */
	default long zj() {
		return precisionCastToLong(zf());
	}

	/**
	 * Zn.
	 *
	 * @return the number
	 */
	default Number zn() {
		return zf();
	}
}
