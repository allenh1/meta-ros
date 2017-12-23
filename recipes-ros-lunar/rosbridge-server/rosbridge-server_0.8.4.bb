# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A WebSocket interface to rosbridge."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-twisted-core rosapi rosauth rosbridge-library rospy"
SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/lunar/rosbridge_server/0.8.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e3eea181fab615ea5c8b3d50944bc82"
SRC_URI[sha256sum] = "eb686bd5f18fe5de53d6fbd24cb055d1be7de4dc1da56c98ab70966d284ef8d4"
S = "${WORKDIR}/rosbridge_suite-release-release-lunar-rosbridge_server-0.8.4-0"

inherit catkin
