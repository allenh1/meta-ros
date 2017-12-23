# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rbcar_sim package. It contains RBCAR simulation packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rbcar-control rbcar-gazebo rbcar-joystick rbcar-robot-control rbcar-sim-bringup"
SRC_URI = "https://github.com/RobotnikAutomation/rbcar_sim-release/archive/release/kinetic/rbcar_sim/1.0.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6bb4a89cd1b3a07730e88ddbd0f08598"
SRC_URI[sha256sum] = "330095f2d2e942918b8763c2c298790e1e90f23fde137d6a4e05f2c43687ddb4"
S = "${WORKDIR}/rbcar_sim-release-release-kinetic-rbcar_sim-1.0.4-1"

inherit catkin
