# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "visp_camera_calibration allows easy calibration of      cameras using a customiz"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "camera-calibration-parsers catkin-native geometry-msgs message-generation message-runtime roscpp sensor-msgs std-msgs visp visp-bridge"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/kinetic/visp_camera_calibration/0.10.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3d37b58ff8f3e4e5b935e8fa9fb047c1"
SRC_URI[sha256sum] = "8ba7ebafa1f72b6fb69f8524704aba33c32a9b8907613524a5788bafc880dfcd"
S = "${WORKDIR}/vision_visp-release-release-kinetic-visp_camera_calibration-0.10.0-0"

inherit catkin
