# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "opt_camera"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers catkin-native compressed-image-transport cv-bridge dynamic-reconfigure image-proc roslang rospack sensor-msgs"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/opt_camera/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e17f50a860befaa88d6916f03c1eed63"
SRC_URI[sha256sum] = "7b125115bf027ea9c06d39ef51187b4f916c71f2a3bae6eea45180519d47d6c3"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-opt_camera-2.1.6-0"

inherit catkin
