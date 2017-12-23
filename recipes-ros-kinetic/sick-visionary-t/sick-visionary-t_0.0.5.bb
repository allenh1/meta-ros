# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Open source driver for the SICK Visionary-T 3D TOF camera."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=5075eceb46e8c1f0c28abf2927170f9a"

DEPENDS = "catkin-native sick-visionary-t-driver"
SRC_URI = "https://github.com/SICKAG/sick_visionary_t-release/archive/release/kinetic/sick_visionary_t/0.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "09f87442a9f89eb45ea418ec34b3e73c"
SRC_URI[sha256sum] = "42fd4384a85fdd640e18660549f37a6a2515735affbf52c79d3f681712a5a523"
S = "${WORKDIR}/sick_visionary_t-release-release-kinetic-sick_visionary_t-0.0.5-0"

inherit catkin
