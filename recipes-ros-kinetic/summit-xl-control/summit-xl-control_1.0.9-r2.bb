# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the launch files that load the required controller interfa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robot-state-publisher ros-control ros-controllers summit-xl-pad"
SRC_URI = "https://github.com/RobotnikAutomation/summit_xl_sim-release/archive/release/kinetic/summit_xl_control/1.0.9-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6768db4d92080d173535e0ddf3054518"
SRC_URI[sha256sum] = "e22458a9fe62c721f77c844e5ff58d3f6bea6ba128b5d976365b22cb9aacc94a"
S = "${WORKDIR}/summit_xl_sim-release-release-kinetic-summit_xl_control-1.0.9-2"

inherit catkin
