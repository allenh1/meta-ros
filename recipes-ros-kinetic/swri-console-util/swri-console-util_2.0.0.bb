# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_console_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp swri-math-util"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_console_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "770d6e4a6a1d416f9f566858e343fa03"
SRC_URI[sha256sum] = "13e4036f5cd1b0162b23e86278d33d59a661cf850ebe8bb32fa1b1e8b5f56127"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_console_util-2.0.0-0"

inherit catkin
