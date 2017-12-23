# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rbcar_sim_bringup package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/RobotnikAutomation/rbcar_sim-release/archive/release/kinetic/rbcar_sim_bringup/1.0.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2805564e431a182b0e21e2af9c26d043"
SRC_URI[sha256sum] = "1b87e915b2f12b70b79deb55e7d3e00c902c07e09ed1c457b241ee2d149a194c"
S = "${WORKDIR}/rbcar_sim-release-release-kinetic-rbcar_sim_bringup-1.0.4-1"

inherit catkin
