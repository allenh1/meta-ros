# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS driver for HOKUYO 3D sensor"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp sensor-msgs"
SRC_URI = "https://github.com/at-wat/${PN}-release/archive/release/kinetic/${PN}/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d816ec25f5e39faab14af8c8980222bb"
SRC_URI[sha256sum] = "3a27d56f53d5593dffbacd0ca4b770d56cd821fdb6cabfa525fa18c6b46b4cfe"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.1-0"

inherit catkin
