# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Open source driver for the SICK Visionary-T 3D TOF camera."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5075eceb46e8c1f0c28abf2927170f9a"

DEPENDS = "catkin-native cv-bridge image-transport roscpp roslaunch sensor-msgs"
SRC_URI = "https://github.com/SICKAG/sick_visionary_t-release/archive/release/kinetic/sick_visionary_t_driver/0.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8ad7593196b058db8579f81e75ba8031"
SRC_URI[sha256sum] = "1d8c41a55a787e66638cd0eda28f68ce3725773c25160369426049e8d95d3d18"
S = "${WORKDIR}/sick_visionary_t-release-release-kinetic-sick_visionary_t_driver-0.0.5-0"

inherit catkin
