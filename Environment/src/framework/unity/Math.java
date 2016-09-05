package framework.unity;

import framework.unity.types.Fixed3;
import framework.unity.types.Fixed4;
import framework.unity.types.Float2;
import framework.unity.types.Float3;
import framework.unity.types.Float4;
import framework.unity.types.Float4x4;

public class Math {

	public static Float4 mult(Float4x4 a, Float4 b) {
		return null;
	}

	public static Float3 mult(Float3 a, float b) {
		return null;
	}
	
	public static Fixed3 mult(Fixed3 a, float b) {
		return null;
	}

	public static Float2 mult(Float2 a, float b) {
		return null;
	}

	public static Fixed4 mult(Fixed4 a, Fixed4 b) {
		return null;
	}
	
	public static Fixed3 lerp(Fixed3 a, Fixed3 b, float c) {
		return null;
	}

	/**
	 * Returns x saturated to the range [0,1] as follows:
	 * <p>
	 * <ul>
	 * <li>Returns 0 if x is less than 0; else
	 * <li>Returns 1 if x is greater than 1; else
	 * <li>Returns x otherwise.
	 * </ul>
	 * </p>
	 * For vectors, the returned vector contains the saturated result of each
	 * element of the vector x saturated to [0,1].
	 * 
	 * @param x
	 *            Vector or scalar to saturate.
	 * @return smallest integer not less than a scalar or each vector component.
	 */
	public static Float3 saturate(Float3 x) {
		return null;
	}

	/**
	 * Returns x to the power y.
	 * 
	 * For vectors, the returned vector contains the power of each element of
	 * the base vector raised to the respective element of the exponent vector.
	 * 
	 * @param x
	 *            A base value.
	 * @param y
	 *            The power to raise the base.
	 * @return x to the power y.
	 */
	public static Float3 pow(Float3 x, Float3 y) {
		return null;
	}

	/**
	 * returns the fractional portion of a scalar or each vector component.
	 * 
	 * @param a
	 *            Vector or scalar of which to return its fractional portion.
	 * @return the fractional portion of a scalar or each vector component.
	 */
	public static Float3 frac(Float3 a) {
		return null;
	}
	
	/**
	 * returns the fractional portion of a scalar or each vector component.
	 * 
	 * @param a
	 *            Vector or scalar of which to return its fractional portion.
	 * @return the fractional portion of a scalar or each vector component.
	 */
	public static Float2 frac(Float2 a) {
		return null;
	}

	/**
	 * Returns the absolute value of a scalar or vector.
	 * 
	 * For vectors, the returned vector contains the absolute value of each
	 * element of the input vector.
	 * 
	 * @param a
	 *            Vector or scalar of which to determine the absolute value
	 * @return the absolute value of a scalar or vector.
	 */
	public static float abs(float a) {
		return 0;
	}

}
