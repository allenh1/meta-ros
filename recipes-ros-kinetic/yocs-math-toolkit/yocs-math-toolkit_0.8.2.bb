# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Math toolkit for Yujin open control system. This package is intended to contain "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-config ecl-exceptions ecl-formatters ecl-linear-algebra geometry-msgs roscpp tf"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_math_toolkit/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "deb05a77d5a62a586bbd31cea3bd2ade"
SRC_URI[sha256sum] = "22c8cee256bee0006130e6ee0ca220a336a609e045d48b56df22163d79320e91"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_math_toolkit-0.8.2-0"

inherit catkin
