package br.furb.melanoma;

import android.R.string;

public class MelanomaPicsSaveControl {

	String path;
	
	public String setImagePath() {

		if (SelecionaRegiaoCorporal.positionGallery == 10) {
			path = "ImageA1";
		} else {
			if (SelecionaRegiaoCorporal.positionGallery == 11) {
				path =  "ImageA2";
			} else {
				if (SelecionaRegiaoCorporal.positionGallery == 12) {
					path =  "ImageA3";
				} else {
					if (SelecionaRegiaoCorporal.positionGallery == 13) {
						path =  "ImageA4";
					} else {
						if (SelecionaRegiaoCorporal.positionGallery == 14) {
							path =  "ImageA5";
						} else {
							if (SelecionaRegiaoCorporal.positionGallery == 20) {
								path =  "ImageB1";
							} else {
								if (SelecionaRegiaoCorporal.positionGallery == 21) {
									path =  "ImageB2";
								} else {
									if (SelecionaRegiaoCorporal.positionGallery == 22) {
										path =  "ImageB3";
									} else {
										if (SelecionaRegiaoCorporal.positionGallery == 23) {
											path =  "ImageB4";
										} else {
											if (SelecionaRegiaoCorporal.positionGallery == 24) {
												path =  "ImageB5";
											} else {
												if (SelecionaRegiaoCorporal.positionGallery == 30) {
													path =  "ImageC1";
												} else {
													if (SelecionaRegiaoCorporal.positionGallery == 31) {
														path =  "ImageC2";
													} else {
														if (SelecionaRegiaoCorporal.positionGallery == 32) {
															path =  "ImageC3";
														} else {
															if (SelecionaRegiaoCorporal.positionGallery == 33) {
																path =  "ImageC4";
															} else {
																if (SelecionaRegiaoCorporal.positionGallery == 34) {
																	path =  "ImageC5";
																} else {
																	if (SelecionaRegiaoCorporal.positionGallery == 40) {
																		path =  "ImageD1";
																	} else {
																		if (SelecionaRegiaoCorporal.positionGallery == 41) {
																			path =  "ImageD2";
																		} else {
																			if (SelecionaRegiaoCorporal.positionGallery == 42) {
																				path =  "ImageD3";
																			} else {
																				if (SelecionaRegiaoCorporal.positionGallery == 43) {
																					path =  "ImageD4";
																				} else {
																					if (SelecionaRegiaoCorporal.positionGallery == 44) {
																						path =  "ImageD5";
																					} else {
																						if (SelecionaRegiaoCorporal.positionGallery == 50) {
																							path =  "ImageE1";
																						} else {
																							if (SelecionaRegiaoCorporal.positionGallery == 51) {
																								path =  "ImageE2";
																							} else {
																								if (SelecionaRegiaoCorporal.positionGallery == 52) {
																									path =  "ImageE3";
																								} else {
																									if (SelecionaRegiaoCorporal.positionGallery == 53) {
																										path =  "ImageE4";
																									} else {
																										if (SelecionaRegiaoCorporal.positionGallery == 54) {
																											path =  "ImageE5";
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
