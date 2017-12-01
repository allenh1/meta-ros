# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides message types commonly used with Autonomous Underwater Veh"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geographic-msgs geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/oceansystemslab/auv_msgs-release/archive/release/lunar/auv_msgs/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "59557cb42a5bebbd605f61302fbfabee"
SRC_URI[sha256sum] = "94ab1a11a70d679012de53bd67f97bcb1e69e188c54dce97cf3fb3e04728a43b"
S = "${WORKDIR}/auv_msgs-release-release-lunar-auv_msgs-0.1.0-0"

inherit catkin
