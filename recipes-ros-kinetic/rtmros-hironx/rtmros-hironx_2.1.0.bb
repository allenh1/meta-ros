# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rtmros_hironx package is an operating interface via ROS and OpenRTM, for Hir"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hironx-calibration hironx-moveit-config hironx-ros-bridge"
SRC_URI = "https://github.com/tork-a/rtmros_hironx-release/archive/release/kinetic/rtmros_hironx/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5508a2226a5a77a61e77883952649057"
SRC_URI[sha256sum] = "d9ad0e756ae9888c93e3619b8193c08744ad66ac21556392c14ad9b365e1bfac"
S = "${WORKDIR}/rtmros_hironx-release-release-kinetic-rtmros_hironx-2.1.0-0"

inherit catkin
