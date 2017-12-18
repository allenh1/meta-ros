# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Libraries and utilities for embedded and low-level linux development."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin ecl-config ecl-converters-lite ecl-errors ecl-io ecl-sigslots-lite ecl-time-lite"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/lunar/ecl_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9d2aa0dc5a6804492fed42cc9a3df684"
SRC_URI[sha256sum] = "3837e30579ef921ce78c3dd69399fc177f78ca9d22551ba43ec6cadc87606ec9"
S = "${WORKDIR}/ecl_lite-release-release-lunar-ecl_lite-0.61.6-0"

inherit catkin
