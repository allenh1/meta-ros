# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native cmake-modules control-toolbox eigen eigen-conversions geometry-msgs mavros mavros-extras roscpp std-msgs tf2-ros"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/test_mavros/0.21.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c3b0caeda264c44d78024579ee91f0e5"
SRC_URI[sha256sum] = "e81339407b09b85ec367b24119af37925215de7929945cf4b39739a0b6f0c866"
S = "${WORKDIR}/mavros-release-release-lunar-test_mavros-0.21.4-0"

inherit catkin
