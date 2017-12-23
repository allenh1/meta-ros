# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The summit_x_common package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native summit-x-description"
SRC_URI = "https://github.com/RobotnikAutomation/summit_x_common-release/archive/release/kinetic/summit_x_common/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ed1ebcf53bf979da98cd07590a96437"
SRC_URI[sha256sum] = "259a74cf499c88a43459a3ae1e1a60f91311989c50bd43d8ba1a571356d08ac8"
S = "${WORKDIR}/summit_x_common-release-release-kinetic-summit_x_common-0.1.0-0"

inherit catkin
