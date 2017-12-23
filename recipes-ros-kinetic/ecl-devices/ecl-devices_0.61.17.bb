# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an extensible and standardised framework for input-output devices."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-containers ecl-errors ecl-license ecl-mpl ecl-threads ecl-type-traits ecl-utilities"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_devices/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ed27b4e596294fe6598bd96bac9aec5b"
SRC_URI[sha256sum] = "cbf3f3778fe313992a4905f204a150477e4138566b04eb357c9d8e4407a898e5"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_devices-0.61.17-0"

inherit catkin
