# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "visp_camera_calibration allows easy calibration of      cameras using a customiz"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "camera-calibration-parsers catkin-native geometry-msgs message-generation message-runtime roscpp sensor-msgs std-msgs visp visp-bridge"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/lunar/visp_camera_calibration/0.10.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c363848c825d003c1707a337c3c08044"
SRC_URI[sha256sum] = "b0668faf9ac6893beba5248dd55f2b5630ca00c99c1257fed6ea9202fb30e86c"
S = "${WORKDIR}/vision_visp-release-release-lunar-visp_camera_calibration-0.10.0-1"

inherit catkin
