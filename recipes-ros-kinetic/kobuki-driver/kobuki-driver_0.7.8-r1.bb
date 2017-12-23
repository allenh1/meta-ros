# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ driver library for Kobuki:     Pure C++ driver library for Kobuki. This is f"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-command-line ecl-converters ecl-devices ecl-geometry ecl-mobile-robot ecl-sigslots ecl-time"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/kinetic/kobuki_driver/0.7.8-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1f925fdcbfbf99df7d0baebcb568f378"
SRC_URI[sha256sum] = "7376a92a141b25ec96cd9080918057e5d2d57f1d612674ff200e98f0aa0a7116"
S = "${WORKDIR}/kobuki_core-release-release-kinetic-kobuki_driver-0.7.8-1"

inherit catkin
