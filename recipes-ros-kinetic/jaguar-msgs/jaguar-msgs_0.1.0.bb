# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for DrRobot's Jaguar 4X4"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/gstavrinos/jaguar-release/archive/release/kinetic/jaguar_msgs/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "947e7961bd3ccddab2e814d3ecf5ad8e"
SRC_URI[sha256sum] = "deaafb06cb77f01a7557b79cf20f1056487d7340ccd234399c210fe0f423cda0"
S = "${WORKDIR}/jaguar-release-release-kinetic-jaguar_msgs-0.1.0-0"

inherit catkin
