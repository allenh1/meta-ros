# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles python-empy-native cmake-modules control-toolbox eigen eigen-conversions geometry-msgs mavros mavros-extras roscpp std-msgs tf2-ros"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/test_mavros/0.19.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6b97c44dbc05a11ea5b31d219b5f22f4"
SRC_URI[sha256sum] = "859008c5e8fa64d131bd35dfe73a5511e7fbad57ab3373b880ffbebfa02d3c0d"
S = "${WORKDIR}/mavros-release-release-lunar-test_mavros-0.19.0-0"

inherit catkin
