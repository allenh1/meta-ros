# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The romeo_bringup package      contains launch and configuration files required "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native naoqi-driver romeo-description romeo-sensors-py"
SRC_URI = "https://github.com/ros-aldebaran/romeo_robot-release/archive/release/kinetic/romeo_bringup/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "070630340116d7f04c461eec4c2c1612"
SRC_URI[sha256sum] = "fe33b8c54668fc9ccf96dcb224bc6c81d0b733b27730af7a6a374f6d196f01ef"
S = "${WORKDIR}/romeo_robot-release-release-kinetic-romeo_bringup-0.1.5-0"

inherit catkin
