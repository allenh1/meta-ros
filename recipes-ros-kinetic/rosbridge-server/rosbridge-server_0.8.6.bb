# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A WebSocket interface to rosbridge."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-twisted-core rosapi rosauth rosbridge-library rospy"
SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/kinetic/rosbridge_server/0.8.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "509b2d2323c79a369e6b527fbd646e33"
SRC_URI[sha256sum] = "0db0a188cb88c03cc678891dc04e9032de6fd88111a17bc79933c94d6c5468ac"
S = "${WORKDIR}/rosbridge_suite-release-release-kinetic-rosbridge_server-0.8.6-0"

inherit catkin
