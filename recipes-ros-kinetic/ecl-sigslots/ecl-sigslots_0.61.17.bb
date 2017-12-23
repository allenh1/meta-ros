# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a signal/slot mechanism (in the same vein as qt sigslots,       boost::"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-license ecl-threads"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_sigslots/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3560260bd3f09a4aea67444f833e6a2f"
SRC_URI[sha256sum] = "382d5bdd1f07a31b42a05acce8c356683ee6ab75c40b5fdd32a55de28a3da2e8"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_sigslots-0.61.17-0"

inherit catkin
