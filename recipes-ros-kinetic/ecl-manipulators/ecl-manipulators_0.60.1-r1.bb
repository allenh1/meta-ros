# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Deploys various manipulation algorithms, currently just      feedforward filters"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-exceptions ecl-formatters ecl-geometry ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_manipulation-release/archive/release/kinetic/ecl_manipulators/0.60.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "61b78731fcf53b17d2bd1dcff3fa2015"
SRC_URI[sha256sum] = "7e26de305073066fc8e1025448dfbf33af8b5b0a2f464495ec43c0e1e7224730"
S = "${WORKDIR}/ecl_manipulation-release-release-kinetic-ecl_manipulators-0.60.1-1"

inherit catkin
