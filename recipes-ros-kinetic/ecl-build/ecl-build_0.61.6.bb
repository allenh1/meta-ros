# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Collection of cmake/make build tools primarily for ecl development itself, but a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/kinetic/ecl_build/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cb357c8a7fe79cb164ac95161e7238f3"
SRC_URI[sha256sum] = "54d4da8a3f3d361e2ad8cdcf0afe44fc7af21e82886cdf73d63fabd500ec4825"
S = "${WORKDIR}/ecl_tools-release-release-kinetic-ecl_build-0.61.6-0"

inherit catkin
