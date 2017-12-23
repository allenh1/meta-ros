# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides simple support to cmath, filling in holes     or redefinin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-license ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_math/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d6e013e4a3f7ef2fd21be16bbf3d9846"
SRC_URI[sha256sum] = "855c4727088c139afe858c21c6b4087f1a6505f6d96b7a41d1e9affb4610fc49"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_math-0.61.17-0"

inherit catkin
