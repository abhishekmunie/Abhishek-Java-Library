package abhishekjava.science;

import java.math.BigDecimal;

/**
 * Stores Fundamental Constants used in various scientific calculations. <tr>
 * It stores the value in String Datatype.
 * @author Abhishek Munie
 */
public class Constants {

	 /**
	  * Constant: Value of π <tr>
	  * Symbol: π <tr>
	  * Unit: null <tr>
	  */
	 public static final double Pi = 3.1415926535897932384626433832795;
	 /**
	  * Constant: Accleration due to gravity/free-fall <tr>
	  * Symbol: g <tr>
	  * Unit: m s-2 <tr>
	  */
	 public static final double g = 9.80665;
	 /**
	  * Constant: Avogadro Constant <tr>
	  * Symbol: L or N_A <tr>
	  * Unit: mol-1 <tr>
	  */
	 public static final double L = 6.02214199e23;
	 /**
	  * Constant: Boltzmann Constant <tr>
	  * Symbol: k(=R/L) <tr>
	  * Unit: J K-1 <tr>
	  */
	 public static final double k = 1.3806503e-23;
	 /**
	  * Constant: Electric Constant <tr>
	  * Symbol: ε_ο <tr>
	  * Unit: F m-1 <tr>
	  */
	 public static final double e_o = 8.85418781762e-12;
// BigDecimal.ONE.divide(BigDecimal.valueOf(Pi).multiply(BigDecimal.valueOf(4)).multiply(BigDecimal.valueOf(10e-7)).multiply(BigDecimal.valueOf(299792458.0)).multiply(BigDecimal.valueOf(299792458.0))).doubleValue();
	 /**
	  * Constant: Electronic Charge <tr>
	  * Symbol: e <tr>
	  * Unit: C <tr>
	  */
	 public static final double e = 1.602176462e-19;
	 /**
	  * Constant: Electronic rest mass <tr>
	  * Symbol: m_e <tr>
	  * Unit: kg <tr>
	  */
	 public static final double m_e = 9.10938188e-31;
	 /**
	  * Constant: Faraday Constant <tr>
	  * Symbol: F <tr>
	  * Unit: C mole-1 <tr>
	  */
	 public static final double F = 9.6485309e4;
	 /**
	  * Constant: Gas Constant <tr>
	  * Symbol: R <tr>
	  * Unit: J K-1 mole-1 <tr>
	  */
	 public static final double R = 8.314472;
	 /**
	  * Constant: Gravitatinal Constant <tr>
	  * Symbol: G <tr>
	  * Unit: m3 kg-1 s-2 <tr>
	  */
	 public static final double G = 6.67259e-11;
	 /**
	  * Constant: Loschmidt's Constant <tr>
	  * Symbol: N_L <tr>
	  * Unit: m-3 <tr>
	  */
	 public static final double N_L = 2.686763e25;
	 /**
	  * Constant: Magnetic Constant or Permeability of Free Space <tr>
	  * Symbol: μ_ο <tr>
	  * Unit: H m-1 <tr>
	  */
	 public static final double mu_o = BigDecimal.valueOf(3.1415926535897932384626433832795).multiply(BigDecimal.valueOf(4)).multiply(BigDecimal.valueOf(1, 7)).doubleValue();
	 /**
	  * Constant: Plank constant <tr>
	  * Symbol: h <tr>
	  * Unit: J s <tr>
	  */
	 public static final double h = 6.6260755e-34;
	 /**
	  * Constant: neutron rest mass <tr>
	  * Symbol: m_n <tr>
	  * Unit: kg <tr>
	  */
	 public static final double m_n = 1.6749286e-27;
	 /**
	  * Constant: proton rest mass <tr>
	  * Symbol: m_p <tr>
	  * Unit:  <tr>
	  */
	 public static final double m_p = 1.6726231e-27;
	 /**
	  * Constant: speed of light <tr>
	  * Symbol: c <tr>
	  * Unit: m s-1 <tr>
	  */
	 public static final double c = 229792458;
	 /**
	  * Constant: Stefan-Boltzmann constant <tr>
	  * Symbol: σ <tr>
	  * Unit: W m-2 K-4 <tr>
	  */
	 public static final double sigma = 5.67051e-8;
	 /**
	  * Constant: Constant for nuclear radius <tr>
	  * Symbol: r_ο <tr>
	  * Unit: m <tr>
	  */
	 public static final double r_o = 1.414e-15;
}
