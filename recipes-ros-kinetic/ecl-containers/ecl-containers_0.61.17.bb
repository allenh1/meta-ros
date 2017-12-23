# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The containers included here are intended to extend the stl containers.     In a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-converters ecl-errors ecl-exceptions ecl-formatters ecl-license ecl-mpl ecl-type-traits ecl-utilities"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_containers/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6d44db786d7203b0720270c8eff318f7"
SRC_URI[sha256sum] = "0fe9acea89bd3b876af55c8f8ff5f352cc24e0a5ce03f3aee2294a8f5a4a4728"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_containers-0.61.17-0"

inherit catkin
