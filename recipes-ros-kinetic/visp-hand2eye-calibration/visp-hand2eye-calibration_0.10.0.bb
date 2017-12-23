# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "visp_hand2eye_calibration estimates the camera position with respect      to its"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "catkin-native geometry-msgs image-proc message-generation message-runtime roscpp sensor-msgs std-msgs visp visp-bridge"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/kinetic/visp_hand2eye_calibration/0.10.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ad06c7d6c545611365890940982f771a"
SRC_URI[sha256sum] = "691fc27d7281958a709dcbdb32afe3d5166ad0fa53bcfe915382e540bf0a6a80"
S = "${WORKDIR}/vision_visp-release-release-kinetic-visp_hand2eye_calibration-0.10.0-0"

inherit catkin
