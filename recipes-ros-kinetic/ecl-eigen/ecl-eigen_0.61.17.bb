# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This provides an Eigen implementation for ecl's linear algebra."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules ecl-license eigen"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_eigen/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "755f4adade422b5e439a2855ccc9f5bf"
SRC_URI[sha256sum] = "013625037effc50a076e804e48e171e0db6c63a2bb92c2822ba34a387caa7f48"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_eigen-0.61.17-0"

inherit catkin
