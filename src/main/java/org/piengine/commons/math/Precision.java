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

/**
 * The Interface Precision.
 */
public interface Precision {

	/**
	 * The Interface PrecisionTd.
	 */
	interface PrecisionTd extends Precision {
		
		/**
		 * @see org.piengine.commons.math.Precision#precisionType()
		 */
		@Override
		default PrecisionType precisionType() {
			return PrecisionType.DOUBLE;
		}

	}

	/**
	 * The Interface PrecisionTf.
	 */
	interface PrecisionTf extends Precision {
		
		/**
		 * @see org.piengine.commons.math.Precision#precisionType()
		 */
		@Override
		default PrecisionType precisionType() {
			return PrecisionType.FLOAT;
		}

	}

	/**
	 * The Interface PrecisionTi.
	 */
	interface PrecisionTi extends Precision {
		
		/**
		 * @see org.piengine.commons.math.Precision#precisionType()
		 */
		@Override
		default PrecisionType precisionType() {
			return PrecisionType.INT;
		}
	}

	/**
	 * The Interface PrecisionTj.
	 */
	interface PrecisionTj extends Precision {
		
		/**
		 * @see org.piengine.commons.math.Precision#precisionType()
		 */
		@Override
		default PrecisionType precisionType() {
			return PrecisionType.LONG;
		}
	}

	/**
	 * The Enum PrecisionType.
	 */
	enum PrecisionType {
		
		/** The int. */
		INT,
		
		/** The long. */
		LONG,
		
		/** The float. */
		FLOAT,
		
		/** The double. */
		DOUBLE;
	}

	/**
	 * Precision cast to double.
	 *
	 * @param vd the vd
	 * @return the double
	 */
	default double precisionCastToDouble(double vd) {
		return vd;
	}

	/**
	 * Precision cast to double.
	 *
	 * @param vf the vf
	 * @return the double
	 */
	default double precisionCastToDouble(float vf) {
		return vf;
	}

	/**
	 * Precision cast to double.
	 *
	 * @param vi the vi
	 * @return the double
	 */
	default double precisionCastToDouble(int vi) {
		return vi;
	}

	/**
	 * Precision cast to double.
	 *
	 * @param vj the vj
	 * @return the double
	 */
	default double precisionCastToDouble(long vj) {
		if (vj instanceof double vd)
			return vd;

		return vj < 0 ? Double.MIN_VALUE : Double.MAX_VALUE;
	}

	/**
	 * Precision cast to int.
	 *
	 * @param n the n
	 * @return the int
	 */
	default int precisionCastToInt(Number n) {
		return switch (n) {
		case long j -> precisionCastToInt(j);
		case float f -> precisionCastToInt(f);
		case double d -> precisionCastToInt(d);
		default -> n.intValue();
		};
	}
	
	/**
	 * Precision cast to long.
	 *
	 * @param n the n
	 * @return the long
	 */
	default long precisionCastToLong(Number n) {
		return switch (n) {
		case long i -> precisionCastToLong(i);
		case float f -> precisionCastToLong(f);
		case double d -> precisionCastToLong(d);
		default -> n.longValue();
		};
	}

	/**
	 * Precision cast to float.
	 *
	 * @param n the n
	 * @return the float
	 */
	default float precisionCastToFloat(Number n) {
		return switch (n) {
		case int i -> precisionCastToFloat(i);
		case long j -> precisionCastToFloat(j);
		case double d -> precisionCastToFloat(d);
		default -> n.floatValue();
		};
	}

	/**
	 * Precision cast to double.
	 *
	 * @param n the n
	 * @return the double
	 */
	default double precisionCastToDouble(Number n) {
		return switch (n) {
		case int i -> precisionCastToDouble(i);
		case long j -> precisionCastToDouble(j);
		case float f -> precisionCastToDouble(f);
		default -> n.doubleValue();
		};
	}

	/**
	 * Precision cast to float.
	 *
	 * @param vd the vd
	 * @return the float
	 */
	default float precisionCastToFloat(double vd) {
		if (vd instanceof float vf)
			return vf;

		return vd < 0 ? Float.MIN_VALUE : Float.MAX_VALUE;
	}

	/**
	 * Precision cast to float.
	 *
	 * @param vf the vf
	 * @return the float
	 */
	default float precisionCastToFloat(float vf) {
		return vf;
	}

	/**
	 * Precision cast to float.
	 *
	 * @param vi the vi
	 * @return the float
	 */
	default float precisionCastToFloat(int vi) {
		if (vi instanceof float vf)
			return vf;

		return vi < 0 ? Float.MIN_VALUE : Float.MAX_VALUE;
	}

	/**
	 * Precision cast to float.
	 *
	 * @param vj the vj
	 * @return the float
	 */
	default float precisionCastToFloat(long vj) {
		if (vj instanceof float vf)
			return vf;

		return vj < 0 ? Float.MIN_VALUE : Float.MAX_VALUE;
	}

	/**
	 * Precision cast to int.
	 *
	 * @param vd the vd
	 * @return the int
	 */
	default int precisionCastToInt(double vd) {
		if (vd instanceof int vf)
			return vf;

		return vd < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
	}

	/**
	 * Precision cast to int.
	 *
	 * @param vf the vf
	 * @return the int
	 */
	default int precisionCastToInt(float vf) {
		if (vf instanceof int vi)
			return vi;

		return vf < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
	}

	/**
	 * Precision cast to int.
	 *
	 * @param vi the vi
	 * @return the int
	 */
	default int precisionCastToInt(int vi) {
		return vi;
	}

	/**
	 * Precision cast to int.
	 *
	 * @param vj the vj
	 * @return the int
	 */
	default int precisionCastToInt(long vj) {
		if (vj instanceof int vi)
			return vi;

		return vj < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
	}

	/**
	 * Precision cast to long.
	 *
	 * @param vd the vd
	 * @return the long
	 */
	default long precisionCastToLong(double vd) {
		if (vd instanceof long vj)
			return vj;

		return vd < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
	}

	/**
	 * Precision cast to long.
	 *
	 * @param vf the vf
	 * @return the long
	 */
	default long precisionCastToLong(float vf) {
		return (long) vf;
	}

	/**
	 * Precision cast to long.
	 *
	 * @param vi the vi
	 * @return the long
	 */
	default long precisionCastToLong(int vi) {
		return vi;
	}

	/**
	 * Precision cast to long.
	 *
	 * @param vj the vj
	 * @return the long
	 */
	default long precisionCastToLong(long vj) {
		return vj;
	}

	/**
	 * Precision type.
	 *
	 * @return the precision type
	 */
	PrecisionType precisionType();
}