# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF description of the Summit XL and Summit XL HL and omni versions"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robot-state-publisher robotnik-sensors roslaunch urdf xacro"
SRC_URI = "https://github.com/RobotnikAutomation/summit_xl_common-release/archive/release/kinetic/summit_xl_description/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0deea9762485652446757c15c53df074"
SRC_URI[sha256sum] = "210a3d5d8bfdb2b269cdfe7c122a93cedbee1a16bc05093089cb48550a3602f7"
S = "${WORKDIR}/summit_xl_common-release-release-kinetic-summit_xl_description-1.1.2-0"

inherit catkin
