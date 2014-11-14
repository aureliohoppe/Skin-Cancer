package br.furb.melanoma;

import android.R.string;

public class MelanomaPicsSaveControl {

	String path;
	
	public String setImagePath() {

		if (SelectBodyPart.positionGallery == 10) {
			path = "A1";
		} else {
			if (SelectBodyPart.positionGallery == 11) {
				path =  "A2";
			} else {
				if (SelectBodyPart.positionGallery == 12) {
					path =  "A3";
				} else {
					if (SelectBodyPart.positionGallery == 13) {
						path =  "A4";
					} else {
						if (SelectBodyPart.positionGallery == 14) {
							path =  "A5";
						} else {
							if (SelectBodyPart.positionGallery == 20) {
								path =  "B1";
							} else {
								if (SelectBodyPart.positionGallery == 21) {
									path =  "B2";
								} else {
									if (SelectBodyPart.positionGallery == 22) {
										path =  "B3";
									} else {
										if (SelectBodyPart.positionGallery == 23) {
											path =  "B4";
										} else {
											if (SelectBodyPart.positionGallery == 24) {
												path =  "B5";
											} else {
												if (SelectBodyPart.positionGallery == 30) {
													path =  "C1";
												} else {
													if (SelectBodyPart.positionGallery == 31) {
														path =  "C2";
													} else {
														if (SelectBodyPart.positionGallery == 32) {
															path =  "C3";
														} else {
															if (SelectBodyPart.positionGallery == 33) {
																path =  "C4";
															} else {
																if (SelectBodyPart.positionGallery == 34) {
																	path =  "C5";
																} else {
																	if (SelectBodyPart.positionGallery == 40) {
																		path =  "D1";
																	} else {
																		if (SelectBodyPart.positionGallery == 41) {
																			path =  "D2";
																		} else {
																			if (SelectBodyPart.positionGallery == 42) {
																				path =  "D3";
																			} else {
																				if (SelectBodyPart.positionGallery == 43) {
																					path =  "D4";
																				} else {
																					if (SelectBodyPart.positionGallery == 44) {
																						path =  "D5";
																					} else {
																						if (SelectBodyPart.positionGallery == 50) {
																							path =  "E1";
																						} else {
																							if (SelectBodyPart.positionGallery == 51) {
																								path =  "E2";
																							} else {
																								if (SelectBodyPart.positionGallery == 52) {
																									path =  "E3";
																								} else {
																									if (SelectBodyPart.positionGallery == 53) {
																										path =  "E4";
																									} else {
																										if (SelectBodyPart.positionGallery == 54) {
																											path =  "E5";
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	
		return path;
	}
}
