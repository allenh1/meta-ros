# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The summit_x_description package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robot-state-publisher robotnik-sensors urdf xacro"
SRC_URI = "https://github.com/RobotnikAutomation/summit_x_common-release/archive/release/kinetic/summit_x_description/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "912482eabbb4fe574103564d4dde01cb"
SRC_URI[sha256sum] = "43a639d5d44313b61f8e731fb9baffb1ba9d71d7b02dbb77e4a53447ca8822cb"
S = "${WORKDIR}/summit_x_common-release-release-kinetic-summit_x_description-0.1.0-0"

inherit catkin
