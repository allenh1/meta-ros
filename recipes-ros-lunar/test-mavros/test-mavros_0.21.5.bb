# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin cmake-modules control-toolbox eigen eigen-conversions geometry-msgs mavros mavros-extras roscpp std-msgs tf2-ros"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/test_mavros/0.21.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c543e821eac9a45c6fb92330ac79ba61"
SRC_URI[sha256sum] = "d2e70a5e9613c5c60164073bbdca5c50be1bc7ce25ae5fe1e99d973c02f5e0a6"
S = "${WORKDIR}/mavros-release-release-lunar-test_mavros-0.21.5-0"

inherit catkin
