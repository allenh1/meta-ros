# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Collection of cmake/make build tools primarily for ecl development itself, but a"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/lunar/ecl_build/0.61.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "076848521f410e3cd2eefe596364abc5"
SRC_URI[sha256sum] = "30eed8cdb2fc6788e547720ff896c3488d1125148a357859c8a1ca5b0bd21b34"
S = "${WORKDIR}/ecl_tools-release-release-lunar-ecl_build-0.61.7-0"

inherit catkin
