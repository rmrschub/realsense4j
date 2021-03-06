/**
 * 
 */
package de.dfki.resc28.realsense4j.util;

/**
 * @author resc01
 *
 */
public enum Option 
{
	COLOR_BACKLIGHT_COMPENSATION (0), 
	COLOR_BRIGHTNESS (1), 
	COLOR_CONTRAST (2),
	/**
	 * Controls exposure time of color camera. Setting any value will disable auto exposure.
	 */
	COLOR_EXPOSURE (3),
	COLOR_GAIN (4), 
	COLOR_GAMMA (5), 
	COLOR_HUE (6), 
	COLOR_SATURATION (7), 
	COLOR_SHARPNESS (8),
	/**
	 * CONTROLS WHITE BALANCE OF COLOR IMAGE. SETTING ANY VALUE WILL DISABLE AUTO WHITE BALANCE.
	 */
	COLOR_WHITE_BALANCE (9), 
	/**
	 * SET TO 1 TO ENABLE AUTOMATIC EXPOSURE CONTROL),OR 0 TO RETURN TO MANUAL CONTROL
	 */
	COLOR_ENABLE_AUTO_EXPOSURE (10),
	/**
	 * SET TO 1 TO ENABLE AUTOMATIC WHITE BALANCE CONTROL),OR 0 TO RETURN TO MANUAL CONTROL
	 */
	COLOR_ENABLE_AUTO_WHITE_BALANCE (11),
	/**
	 * 0 - 15
	 */
	F200_LASER_POWER (12),
	/**
	 * 0 - 3
	 */
	F200_ACCURACY (13),
	/**
	 * 0 - 100
	 */
	F200_MOTION_RANGE (14),
	/**
	 * 0 - 7
	 */
	F200_FILTER_OPTION (15),
	/**
	 * 0 - 15
	 */
	F200_CONFIDENCE_THRESHOLD (16),
	/**
	 * {2, 5, 15, 30, 60}
	 */
	SR300_DYNAMIC_FPS (17),
	SR300_AUTO_RANGE_ENABLE_MOTION_VERSUS_RANGE (18),
	SR300_AUTO_RANGE_ENABLE_LASER (19),
	SR300_AUTO_RANGE_MIN_MOTION_VERSUS_RANGE (20),
	SR300_AUTO_RANGE_MAX_MOTION_VERSUS_RANGE (21),
	SR300_AUTO_RANGE_START_MOTION_VERSUS_RANGE (22),
	SR300_AUTO_RANGE_MIN_LASER (23),
	SR300_AUTO_RANGE_MAX_LASER (24),
	SR300_AUTO_RANGE_START_LASER (25),
	SR300_AUTO_RANGE_UPPER_THRESHOLD (26),
	SR300_AUTO_RANGE_LOWER_THRESHOLD (27),
	SR300_WAKEUP_DEV_PHASE1_PERIOD (28),
	SR300_WAKEUP_DEV_PHASE1_FPS (29),
	SR300_WAKEUP_DEV_PHASE2_PERIOD (30),
	SR300_WAKEUP_DEV_PHASE2_FPS (31),
	SR300_WAKEUP_DEV_RESET (32),
	SR300_WAKE_ON_USB_REASON (33),
	SR300_WAKE_ON_USB_CONFIDENCE (34),
	/**
	 * {0, 1}
	 */
	R200_LR_AUTO_EXPOSURE_ENABLED (35),
	/**
	 * 100 - 1600 (UNITS OF 0.01)
	 */
	R200_LR_GAIN (36),
	/**
	 * 0 (UNITS OF 0.1 MS),
	 */
	R200_LR_EXPOSURE (37),
	/**
	 * {0 , 1}
	 */
	R200_EMITTER_ENABLED (38),
	/**
	 * MICROMETERS PER INCREMENT IN INTEGER DEPTH VALUES),1000 IS DEFAULT (MM SCALE),
	 */
	R200_DEPTH_UNITS (39),
	/**
	 * {0 - USHORT_MAX}. CAN ONLY BE SET BEFORE STREAMING STARTS.
	 */
	R200_DEPTH_CLAMP_MIN (40),
	/**
	 * {0 - USHORT_MAX}. CAN ONLY BE SET BEFORE STREAMING STARTS.
	 */
	R200_DEPTH_CLAMP_MAX (41),
	/**
	 * {0 - 1000}. THE INCREMENTS IN INTEGER DISPARITY VALUES CORRESPONDING TO ONE PIXEL OF DISPARITY. CAN ONLY BE SET BEFORE STREAMING STARTS.
	 */
	R200_DISPARITY_MULTIPLIER (42),
	/**
	 * {0 - 512}. CAN ONLY BE SET BEFORE STREAMING STARTS.
	 */
	R200_DISPARITY_SHIFT (43),
	R200_AUTO_EXPOSURE_MEAN_INTENSITY_SET_POINT (44),
	R200_AUTO_EXPOSURE_BRIGHT_RATIO_SET_POINT (45),
	R200_AUTO_EXPOSURE_KP_GAIN (46),
	R200_AUTO_EXPOSURE_KP_EXPOSURE (47),
	R200_AUTO_EXPOSURE_KP_DARK_THRESHOLD (48),
	R200_AUTO_EXPOSURE_TOP_EDGE (49),
	R200_AUTO_EXPOSURE_BOTTOM_EDGE (50),
	R200_AUTO_EXPOSURE_LEFT_EDGE (51),
	R200_AUTO_EXPOSURE_RIGHT_EDGE (52),
	R200_DEPTH_CONTROL_ESTIMATE_MEDIAN_DECREMENT (53),
	R200_DEPTH_CONTROL_ESTIMATE_MEDIAN_INCREMENT (54),
	R200_DEPTH_CONTROL_MEDIAN_THRESHOLD (55),
	R200_DEPTH_CONTROL_SCORE_MINIMUM_THRESHOLD (56),
	R200_DEPTH_CONTROL_SCORE_MAXIMUM_THRESHOLD (57),
	R200_DEPTH_CONTROL_TEXTURE_COUNT_THRESHOLD (58),
	R200_DEPTH_CONTROL_TEXTURE_DIFFERENCE_THRESHOLD (59),
	R200_DEPTH_CONTROL_SECOND_PEAK_THRESHOLD (60),
	R200_DEPTH_CONTROL_NEIGHBOR_THRESHOLD (61),
	R200_DEPTH_CONTROL_LR_THRESHOLD (62);
	
	Option(int optionCode)
	{
		m_optionCode = optionCode ;
	}
	
	private final int m_optionCode;
}
