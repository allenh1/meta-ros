# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack aims to bring the common tools and algorithms needed to     develop n"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-mobile-robot"
SRC_URI = "https://github.com/yujinrobot-release/ecl_navigation-release/archive/release/kinetic/ecl_navigation/0.60.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ddfe717e537d0f1f6fb0eda24fe79c3"
SRC_URI[sha256sum] = "f891037ee8353a0aaf8e91f6db00a8a5c26213977901b7ec5d0752eae1e8b22c"
S = "${WORKDIR}/ecl_navigation-release-release-kinetic-ecl_navigation-0.60.3-0"

inherit catkin
