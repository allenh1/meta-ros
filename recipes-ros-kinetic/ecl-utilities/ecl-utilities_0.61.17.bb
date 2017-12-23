# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Includes various supporting tools and utilities for c++ programming."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-concepts ecl-license ecl-mpl"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_utilities/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "305e3f19ce3802d8471a0c770de8d127"
SRC_URI[sha256sum] = "143290ffd96c153138f6581b1ad563a00791e169af520f106c92226926348de7"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_utilities-0.61.17-0"

inherit catkin
