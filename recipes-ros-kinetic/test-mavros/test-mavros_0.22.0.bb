# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & GPL-3 & LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native cmake-modules control-toolbox eigen eigen-conversions geometry-msgs mavros mavros-extras roscpp std-msgs tf2-ros"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/kinetic/test_mavros/0.22.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aec7d24d6ebc6de88136573284478263"
SRC_URI[sha256sum] = "a69eebbfdc9845cc22a3f68295faede20e17fcde1eb8da0050738489e2109e58"
S = "${WORKDIR}/mavros-release-release-kinetic-test_mavros-0.22.0-0"

inherit catkin
