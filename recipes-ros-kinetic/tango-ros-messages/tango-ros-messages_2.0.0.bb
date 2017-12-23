# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains messages/services used by tango ros lib"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=211ba54883815de9f52a3dcd9f281523"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/Intermodalics/tango_ros-release/archive/release/kinetic/tango_ros_messages/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aa6024fc9455422689916d01493e21de"
SRC_URI[sha256sum] = "e322c0fbc460a686ba7d31d087414394ead40ef7eb61e62d1c8a1927f67019af"
S = "${WORKDIR}/tango_ros-release-release-kinetic-tango_ros_messages-2.0.0-0"

inherit catkin
