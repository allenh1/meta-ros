# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Timing utilities are very dependent on the system api provided for their use. 	T"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-config ecl-errors ecl-exceptions ecl-license ecl-time-lite"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_time/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "23767860cd5b9a952d53142f67ecb7dd"
SRC_URI[sha256sum] = "9b198e27672cc60f073d95138afc009f85ffae69966adb3bd4e6ec06f5726ade"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_time-0.61.17-0"

inherit catkin
